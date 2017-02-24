package com.yunpengweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by MaiBenBen on 2017/2/23.
 */

public class County extends DataSupport {

    private int id;

    private String weatherId;

    private int cityId;

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    private String countyName;

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {

        return id;
    }

    public String getWeatherId() {
        return weatherId;
    }



}
