package com.hnu.softwarecollege.infocenter.entity.po;

public class WeatherPo {
    private Integer weatherCode;

    private String weatherDate;

    private String weatherSunrise;

    private String weatherHigh;

    private String weatherLow;

    private String weatherSunset;

    private Float weatherAqi;

    private String weatherNotice;

    private String weatherType;

    private String weatherFl;

    private String weatherFx;

    public Integer getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(Integer weatherCode) {
        this.weatherCode = weatherCode;
    }

    public String getWeatherDate() {
        return weatherDate;
    }

    public void setWeatherDate(String weatherDate) {
        this.weatherDate = weatherDate == null ? null : weatherDate.trim();
    }

    public String getWeatherSunrise() {
        return weatherSunrise;
    }

    public void setWeatherSunrise(String weatherSunrise) {
        this.weatherSunrise = weatherSunrise == null ? null : weatherSunrise.trim();
    }

    public String getWeatherHigh() {
        return weatherHigh;
    }

    public void setWeatherHigh(String weatherHigh) {
        this.weatherHigh = weatherHigh == null ? null : weatherHigh.trim();
    }

    public String getWeatherLow() {
        return weatherLow;
    }

    public void setWeatherLow(String weatherLow) {
        this.weatherLow = weatherLow == null ? null : weatherLow.trim();
    }

    public String getWeatherSunset() {
        return weatherSunset;
    }

    public void setWeatherSunset(String weatherSunset) {
        this.weatherSunset = weatherSunset == null ? null : weatherSunset.trim();
    }

    public Float getWeatherAqi() {
        return weatherAqi;
    }

    public void setWeatherAqi(Float weatherAqi) {
        this.weatherAqi = weatherAqi;
    }

    public String getWeatherNotice() {
        return weatherNotice;
    }

    public void setWeatherNotice(String weatherNotice) {
        this.weatherNotice = weatherNotice == null ? null : weatherNotice.trim();
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType == null ? null : weatherType.trim();
    }

    public String getWeatherFl() {
        return weatherFl;
    }

    public void setWeatherFl(String weatherFl) {
        this.weatherFl = weatherFl == null ? null : weatherFl.trim();
    }

    public String getWeatherFx() {
        return weatherFx;
    }

    public void setWeatherFx(String weatherFx) {
        this.weatherFx = weatherFx == null ? null : weatherFx.trim();
    }
}