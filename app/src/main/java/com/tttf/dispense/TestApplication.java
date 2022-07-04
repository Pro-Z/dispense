package com.tttf.dispense;

import android.app.Application;

import com.example.dispenseprocessing.DispenseProcessing;

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DispenseProcessing.initialization(this).dispatcher();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        DispenseProcessing.release();
    }
}
