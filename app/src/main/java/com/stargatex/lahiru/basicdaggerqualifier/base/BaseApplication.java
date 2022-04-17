package com.stargatex.lahiru.basicdaggerqualifier.base;

import android.content.Context;

import androidx.multidex.MultiDex;

import com.stargatex.lahiru.basicdaggerqualifier.BuildConfig;
import com.stargatex.lahiru.basicdaggerqualifier.di.component.ApplicationComponent;
import com.stargatex.lahiru.basicdaggerqualifier.di.component.DaggerApplicationComponent;
import com.stargatex.lahiru.basicdaggerqualifier.di.module.system.AppInformation;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import timber.log.Timber;


/**
 * @author LahiruJaya
 */
public class BaseApplication extends DaggerApplication {
    private ApplicationComponent component;
    @Inject
    AppInformation appInformation;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        component = DaggerApplicationComponent.builder().application(this).build();
        component.inject(this);
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) Timber.plant();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }




}
