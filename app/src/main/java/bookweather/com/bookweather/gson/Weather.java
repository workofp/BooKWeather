package bookweather.com.bookweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by WP on 2017/7/28.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    public Alarm alarm;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
