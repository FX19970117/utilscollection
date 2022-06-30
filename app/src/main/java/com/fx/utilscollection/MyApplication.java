package com.fx.utilscollection;

import android.app.Application;
import android.content.Context;

/**
 * @author fx
 */
public class MyApplication extends Application {
    /**
     * 全局上下文对象
     */
    public static Context AppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        AppContext = getApplicationContext();


    }


    public static Context getContext() {
        return AppContext;
    }
}
