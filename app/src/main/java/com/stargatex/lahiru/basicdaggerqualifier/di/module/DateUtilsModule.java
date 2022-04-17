package com.stargatex.lahiru.basicdaggerqualifier.di.module;


import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.DateYearOnly;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDate;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDateDashTime;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDateTime;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDateTimeMeridiem;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDateTimeNoMeridiem;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDateWithDash;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDateWithForwardSlash;
import com.stargatex.lahiru.basicdaggerqualifier.di.qualifier.date.FullDateWithNoSpace;

import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Lahiru Jayawickrama (LahiruJay)
 * @version 1.0
 */

@Module
public class DateUtilsModule {

    @Singleton
    @Provides
    @FullDateTime
    SimpleDateFormat provideSimpleDateFormat(){
        String myFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS";
        return new SimpleDateFormat(myFormat, Locale.UK);
    }
    @Singleton
    @Provides
    @FullDate
    SimpleDateFormat provideSimpleDateFormatDate(){
        String myFormat = "yyyy-MM-dd";
        return new SimpleDateFormat(myFormat, Locale.UK);
    }

    @Singleton
    @Provides
    @DateYearOnly
    SimpleDateFormat provideSimpleDateFormatYear(){
        String myFormat = "yyyy";
        return new SimpleDateFormat(myFormat, Locale.UK);
    }

    @Singleton
    @Provides
    @FullDateTimeMeridiem
    SimpleDateFormat provideSimpleDateFormatDateTimeAmPm(){
        String myFormat = "MM/dd/yyyy hh:mm:ss a";
        return new SimpleDateFormat(myFormat, Locale.UK);
    }

    @Singleton
    @Provides
    @FullDateTimeNoMeridiem
    SimpleDateFormat provideSimpleDateFormatDateTime(){
        String myFormat = "MM/dd/yyyy hh:mm:ss";
        return new SimpleDateFormat(myFormat, Locale.UK);
    }

    @Singleton
    @Provides
    @FullDateWithDash
    SimpleDateFormat provideSimpleDateFormatDateDash(){
        String myFormat = "yyyy-MM-dd hh:mm:ss";
        return new SimpleDateFormat(myFormat, Locale.UK);
    }

    @Singleton
    @Provides
    @FullDateWithNoSpace
    SimpleDateFormat provideSimpleDateFormatDateNoSpace(){
        String myFormat = "yyyyMMdd";
        return new SimpleDateFormat(myFormat, Locale.UK);
    }

    @Singleton
    @Provides
    @FullDateDashTime
    SimpleDateFormat provideSdfImageTimeStamp(){
        String myFormat = "yyyyMMdd_HHmmss";
        //String myFormat = "yyyyMMdd_hhmmss";
        return new SimpleDateFormat(myFormat, Locale.UK);
    }

    @Singleton
    @Provides
    @FullDateWithForwardSlash
    SimpleDateFormat provideSdfFullDateWithForwardSlash(){
        String myFormat = "yyyy/MM/dd";
        return new SimpleDateFormat(myFormat, Locale.UK);
    }
}
