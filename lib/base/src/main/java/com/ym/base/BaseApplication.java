package com.ym.base;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

/**
 * @author yangming
 * @date 2020/7/24 10:23
 */
public class BaseApplication extends Application {
    private static BaseApplication sInstance;

    public static BaseApplication getInstance() {
        return sInstance;
    }

    private Boolean isDebug;
    private Boolean isMainProcess;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
         MultiDex.install(this);
    }


}
