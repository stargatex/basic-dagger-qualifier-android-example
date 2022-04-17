package com.stargatex.lahiru.basicdaggerqualifier.di.module;

import android.content.Context;

import com.stargatex.lahiru.basicdaggerqualifier.base.BaseApplication;

import dagger.Module;
import dagger.Provides;

/**
 * @author Lahiru Jayawickrama (lahirujay)
 * @version 1.0
 */
@Module
public class AppContextModule {

    @Provides
    Context provideContext(BaseApplication baseApplication) {
        return baseApplication.getApplicationContext();
    }


}
