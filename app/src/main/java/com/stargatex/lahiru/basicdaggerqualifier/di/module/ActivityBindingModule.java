package com.stargatex.lahiru.basicdaggerqualifier.di.module;


import com.stargatex.lahiru.basicdaggerqualifier.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Lahiru Jayawickrama (lahirujay)
 * @version 1.0
 */
@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract MainActivity bindMainActivity();

}
