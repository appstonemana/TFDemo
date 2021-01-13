package com.mb.tfdemo.app;

import android.app.Application;

import androidx.multidex.MultiDex;

import io.realm.Realm;

/**
 * Created by Manabendu on 13/01/21
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MultiDex.install(this);
        Realm.init(this);
    }
}
