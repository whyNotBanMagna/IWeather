package app.my.iweather.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

import app.my.iweather.WeatherActivity;
import app.my.iweather.gson.Weather;
import app.my.iweather.util.HttpUtil;
import app.my.iweather.util.Utility;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class AutoUpdateService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        updateWeather();
        AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
        int anHour = 8 * 60 * 60 * 1000; // 这是8小时的毫秒数
        long triggerAtTime = SystemClock.elapsedRealtime() + anHour;
        Intent i = new Intent(this, AutoUpdateService.class);
        PendingIntent pi = PendingIntent.getService(this, 0, i, PendingIntent.FLAG_IMMUTABLE);
        manager.cancel(pi);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerAtTime, pi);
        return super.onStartCommand(intent, flags, startId);
    }

    /**
     * 更新天气信息。
     */
    private void updateWeather(){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String cityName = prefs.getString("city", "");
        if (cityName.isEmpty()) {
            String weatherUrl = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + cityName + "?key=XHEWK3SWP6FUNFTEDKGCGYJ4T";
            HttpUtil.sendOkHttpRequest(weatherUrl, new Callback() {
                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(AutoUpdateService.this);
                    prefs.edit().putString("city", cityName).commit();
                }

                @Override
                public void onFailure(Call call, IOException e) {}
            });
        }
    }

}
