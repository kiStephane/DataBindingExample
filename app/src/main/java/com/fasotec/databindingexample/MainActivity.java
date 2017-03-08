package com.fasotec.databindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.fasotec.databindingexample.data.TemperatureData;
import com.fasotec.databindingexample.databinding.MainActivityContract.View;
import com.fasotec.databindingexample.databinding.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.fasotec.databindingexample.databinding.ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this);
        TemperatureData temperatureData = new TemperatureData("10");

        binding.setTemp(temperatureData);
        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius = temperatureData.getCelsius();
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show();
    }
}
