package com.example.testapp.app;

import android.widget.Toast;

import com.example.testapp.HomeApplication;

/**
 * Created by anxiao on 2017/8/25.
 */

public class ToastUnit {
    public static void sortToase(String msg) {
        Toast.makeText(HomeApplication.getInstance(), msg, Toast.LENGTH_SHORT).show();
    }
}
