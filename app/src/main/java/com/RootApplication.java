package com;

import android.app.Application;

import androidx.annotation.Nullable;

import com.osama.mobioptionsads.MobiInitializationListener;
import com.osama.mobioptionsads.MobiOptionsAdsInit;

import org.jetbrains.annotations.NotNull;

public class RootApplication extends Application {

    private static MobiOptionsAdsInit mobiOptionsAdsInit;

    public static RootApplication rootApplication;


    public static synchronized void setupMobiOptionsAds(@NotNull MobiInitializationListener listener) {
        if (mobiOptionsAdsInit == null) {
            mobiOptionsAdsInit = new MobiOptionsAdsInit(rootApplication, "TJ6N6Wy8aZsc9oWW92TuXlIZwsGtj7", listener);
        }
    }


    @Override
    public void onCreate() {
        super.onCreate();
    }

    public RootApplication() {
        super();
        rootApplication = this;
    }
}
