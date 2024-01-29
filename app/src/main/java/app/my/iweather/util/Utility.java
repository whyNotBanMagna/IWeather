package app.my.iweather.util;

import com.google.gson.Gson;
import app.my.iweather.gson.Weather;

public class Utility {


    /**
     * 将返回的JSON数据解析成Weather实体类
     */
    public static Weather handleWeatherResponse(String response) {
        try {
            return new Gson().fromJson(response, Weather.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
