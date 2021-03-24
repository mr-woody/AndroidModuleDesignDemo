package com.woodys.commonbusiness.application;

import android.content.Context;
import android.content.res.Configuration;

import com.woodys.component.api.BaseApplication;
import com.woodys.supercross.SuperCross;
import com.umeng.commonsdk.UMConfigure;


public class CommonApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //umeng初始化SDK
        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, null);
    }

    @Override
    public void attachBaseContext(Context base) {
        SuperCross.setEnableLog(true);
        SuperCross.init(base);
        super.attachBaseContext(base);
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
