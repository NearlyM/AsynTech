package com.nel.asyn;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.nel.asyn.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHander(new EventHandler(this));
    }
}
