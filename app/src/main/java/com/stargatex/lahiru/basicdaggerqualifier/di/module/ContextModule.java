package com.stargatex.lahiru.basicdaggerqualifier.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * @author Lahiru Jayawickrama (lahirujay)
 * @version 1.0
 */

@Module
public abstract class ContextModule {

    @Binds
    abstract Context provideContext(Application application);
}
