package com.titan.mvptutorial;

import android.app.Application;

import com.titan.mvptutorial.component.AppComponent;
import com.titan.mvptutorial.component.DaggerAppComponent;
import com.titan.mvptutorial.module.AppModule;
import com.titan.mvptutorial.module.LoginModule;

public class App extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }
}