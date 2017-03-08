package com.fasotec.databindingexample.databinding;

import com.fasotec.databindingexample.data.TemperatureData;

/**
 * Created by stephaneki on 08/03/2017 .
 */

public interface MainActivityContract {
    public interface Presenter {
        void onShowData(TemperatureData temperatureData);
    }

    public interface View {
        void showData(TemperatureData temperatureData);
    }
}
