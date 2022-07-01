package com.ki1lt0.test_module;


import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.example.dispenseprocessing.IApp;
import com.example.dispenseprocessingannotation.Dispense;

@Dispense(name = "test" , priority = 1, async = true, delay = 10000)
public class TestDispence implements IApp {
    @Override
    public void dispatcher(Application application) {
        Log.e("执行了","执行了");
        Toast.makeText(application.getApplicationContext(), "延时五秒执行", Toast.LENGTH_SHORT).show();
    }
}
