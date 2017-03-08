package com.fasotec.databindingexample.databinding;

import com.fasotec.databindingexample.data.TemperatureData;

/**
 * Created by stephaneki on 08/03/2017 .
 */

public class MainActivityPresenter {
    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }
}
