package com.stargatex.lahiru.basicdaggerqualifier.di.component;

import android.app.Application;

import com.stargatex.lahiru.basicdaggerqualifier.base.BaseApplication;
import com.stargatex.lahiru.basicdaggerqualifier.di.module.ActivityBindingModule;
import com.stargatex.lahiru.basicdaggerqualifier.di.module.ContextModule;
import com.stargatex.lahiru.basicdaggerqualifier.di.module.DateUtilsModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

/**
 * @author LahiruJaya
 */
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ActivityBindingModule.class
        , ContextModule.class, DateUtilsModule.class})
public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {
    void inject(BaseApplication baseApplication);


    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        ApplicationComponent build();
    }
}
