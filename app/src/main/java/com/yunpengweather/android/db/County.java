package com.yunpengweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by MaiBenBen on 2017/2/23.
 */

public class County extends DataSupport {

    private int id;

    private String weatherId;

    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {

        return id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }
}
