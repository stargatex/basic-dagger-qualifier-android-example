package com.stargatex.lahiru.basicdaggerqualifier.ui;

import android.os.Bundle;
import android.view.View;

import com.stargatex.lahiru.basicdaggerqualifier.databinding.ActivityMainBinding;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDate;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDateTimeMeridiem;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Inject
    @FullDate
    SimpleDateFormat sdfFullDate;

    @Inject
    @FullDateTimeMeridiem
    SimpleDateFormat sdfFullDateTimeMeridian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        activityMainBinding.txtDate1.setText(sdfFullDate.format(new Date()));
        activityMainBinding.txtDate2.setText(sdfFullDateTimeMeridian.format(new Date()));

    }
}