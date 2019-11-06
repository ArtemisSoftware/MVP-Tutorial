package com.titan.mvptutorial.component;

import com.titan.mvptutorial.MainActivity;
import com.titan.mvptutorial.module.AppModule;
import com.titan.mvptutorial.module.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {

    void inject(MainActivity target);

}
