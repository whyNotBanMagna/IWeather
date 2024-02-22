package app.my.iweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;

import app.my.iweather.gson.Weather;
import app.my.iweather.util.HttpUtil;
import app.my.iweather.util.SoftInputUtil;
import app.my.iweather.util.Utility;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class WeatherActivity extends AppCompatActivity {

    private ScrollView weatherLayout;

    private ImageView navButton;

    private TextView titleCity;

    private TextView titleUpdateTime;

    private TextView degreeText;

    private TextView weatherInfoText;

    private LinearLayout forecastLayout;

    private TextView sportText;

    private ImageView ivCloseEdit;

    private EditText etAddress;

    private FrameLayout flRoot;
    private ProgressBar progressBar;

    private RecentSearchFragment recentSearchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_weather);
        // 初始化各控件
        weatherLayout = (ScrollView) findViewById(R.id.weather_layout);
        titleCity = (TextView) findViewById(R.id.title_city);
        titleUpdateTime = (TextView) findViewById(R.id.title_update_time);
        degreeText = (TextView) findViewById(R.id.degree_text);
        weatherInfoText = (TextView) findViewById(R.id.weather_info_text);
        forecastLayout = (LinearLayout) findViewById(R.id.forecast_layout);
        sportText = (TextView) findViewById(R.id.sport_text);
        navButton = (ImageView) findViewById(R.id.nav_button);
        etAddress = (EditText) findViewById(R.id.etAddress);
        ivCloseEdit = (ImageView) findViewById(R.id.ivCloseEdit);
        flRoot = (FrameLayout) findViewById(R.id.fl);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String cityName = prefs.getString("city", "");
        String dataString = prefs.getString("search", "[]");
        ArrayList<String> list = new Gson().fromJson(dataString, new TypeToken<ArrayList<String>>() {
        }.getType());
        SearchObj.INSTANCE.getData().addAll(list);
        recentSearchFragment = RecentSearchFragment.newInstance();
        recentSearchFragment.setOnItemClick(integer -> {
            requestWeather(SearchObj.INSTANCE.getData().get(integer));
            ivCloseEdit.setVisibility(View.GONE);
            getSupportFragmentManager().beginTransaction().hide(recentSearchFragment).commitAllowingStateLoss();
            SoftInputUtil.INSTANCE.hideSoftInputView(WeatherActivity.this);
            return null;
        });
        weatherLayout.setVisibility(View.INVISIBLE);
        requestWeather(cityName);


        navButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String address = etAddress.getText().toString().trim();
                etAddress.setText("");
                if (address.isEmpty()) {
                    titleCity.setVisibility(View.GONE);
                    titleUpdateTime.setVisibility(View.GONE);
                    etAddress.setVisibility(View.VISIBLE);
                    ivCloseEdit.setVisibility(View.VISIBLE);
                    if (recentSearchFragment.isAdded()) {
                        getSupportFragmentManager().beginTransaction().show(recentSearchFragment).commitAllowingStateLoss();
                    } else {
                        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, recentSearchFragment).commitAllowingStateLoss();
                    }
                } else {
                    requestWeather(address);
                    ivCloseEdit.setVisibility(View.GONE);
                    getSupportFragmentManager().beginTransaction().hide(recentSearchFragment).commitAllowingStateLoss();
                    SoftInputUtil.INSTANCE.hideSoftInputView(WeatherActivity.this);
                }
            }
        });

        ivCloseEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titleCity.setVisibility(View.VISIBLE);
                titleUpdateTime.setVisibility(View.VISIBLE);
                etAddress.setVisibility(View.GONE);
                ivCloseEdit.setVisibility(View.GONE);
                getSupportFragmentManager().beginTransaction().hide(recentSearchFragment).commitAllowingStateLoss();
            }
        });

    }


    public void requestWeather(String latitude, String longitude) {
        progressBar.setVisibility(View.VISIBLE);
        String weatherUrl = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + latitude + "," + longitude + "?key=XHEWK3SWP6FUNFTEDKGCGYJ4T";
        HttpUtil.sendOkHttpRequest(weatherUrl, new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText = response.body().string();
                final Weather weather = Utility.handleWeatherResponse(responseText);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                        if (weather != null) {
                            showWeatherInfo(weather);
                        } else {
                            Toast.makeText(WeatherActivity.this, "query weather info failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                        Toast.makeText(WeatherActivity.this, "query weather info failed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }


    /**
     * 根据天气id请求城市天气信息。
     */
    public void requestWeather(String address) {
        progressBar.setVisibility(View.VISIBLE);
        String weatherUrl = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + address + "?key=XHEWK3SWP6FUNFTEDKGCGYJ4T";
        HttpUtil.sendOkHttpRequest(weatherUrl, new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText = response.body().string();
                final Weather weather = Utility.handleWeatherResponse(responseText);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                        if (weather != null) {
                            showWeatherInfo(weather);
                            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(WeatherActivity.this);
                            prefs.edit().putString("city", address).commit();

                            boolean isExit = false;
                            for (int i = 0; i < SearchObj.INSTANCE.getData().size(); i++) {
                                if (SearchObj.INSTANCE.getData().get(i).equals(address)) {
                                    isExit = true;
                                    break;
                                }
                            }
                            if (!isExit) {
                                Log.d("dddd","3eeeee");
                                SearchObj.INSTANCE.getData().add(address);
                            }
                        } else {
                            Toast.makeText(WeatherActivity.this, "query weather info failed", Toast.LENGTH_SHORT).show();
                            requestWeather("New York");
                        }
                        titleCity.setVisibility(View.VISIBLE);
                        titleUpdateTime.setVisibility(View.VISIBLE);
                        etAddress.setVisibility(View.GONE);
                    }
                });
            }

            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                        Toast.makeText(WeatherActivity.this, "query weather info failed", Toast.LENGTH_SHORT).show();
                        requestWeather("New York");
                    }
                });
            }
        });
    }

    /**
     * 处理并展示Weather实体类中的数据。
     */
    private void showWeatherInfo(Weather weather) {
        String cityName = weather.getAddress();
        String updateTime = weather.getCurrentConditions().getDatetime();
        titleCity.setText(cityName);
        titleUpdateTime.setText(updateTime);
        degreeText.setText(fahrenheitToCelsius(weather.getCurrentConditions().getTemp()));
        weatherInfoText.setText(weather.getCurrentConditions().getConditions());
        forecastLayout.removeAllViews();
        for (Weather.DaysBean daysBean : weather.getDays()) {
            View view = LayoutInflater.from(this).inflate(R.layout.forecast_item, forecastLayout, false);
            TextView dateText = (TextView) view.findViewById(R.id.date_text);
            TextView infoText = (TextView) view.findViewById(R.id.info_text);
            TextView maxText = (TextView) view.findViewById(R.id.max_text);
            TextView minText = (TextView) view.findViewById(R.id.min_text);
            dateText.setText(daysBean.getDatetime());
            infoText.setText(daysBean.getConditions());
            maxText.setText(fahrenheitToCelsius(daysBean.getTempmax()));
            minText.setText(fahrenheitToCelsius(daysBean.getTempmin()));
            forecastLayout.addView(view);
        }
        sportText.setText(weather.getDescription());
        weatherLayout.setVisibility(View.VISIBLE);
    }


    public static String fahrenheitToCelsius(double fahrenheit) {
        int result = (int) ((5.0 / 9.0) * (fahrenheit - 32));
        return String.valueOf(result);
    }


//    @Override
//    protected void onDestroy() {
//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(WeatherActivity.this);
//        prefs.edit().putString("search", new Gson().toJson(SearchObj.INSTANCE.getData())).commit();
//        super.onDestroy();
//        System.exit(0);
//    }

    @Override
    public void onBackPressed() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(WeatherActivity.this);
        prefs.edit().putString("search", new Gson().toJson(SearchObj.INSTANCE.getData())).commit();
        moveTaskToBack(true);
    }
}
