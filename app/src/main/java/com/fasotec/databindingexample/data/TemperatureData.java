package com.fasotec.databindingexample.data;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.fasotec.databindingexample.BR;

/**
 * Created by stephaneki on 08/03/2017 .
 *
 */
public class TemperatureData extends BaseObservable {

    private String celsius;
    private String fahrenheit;

    public TemperatureData(String celsius) {
        this.celsius = celsius;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }


    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }


}
