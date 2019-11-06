package com.titan.mvptutorial.module;


import com.titan.mvptutorial.LoginActivityMVP;
import com.titan.mvptutorial.model.LoginModel;
import com.titan.mvptutorial.presenter.LoginActivityPresenter;
import com.titan.mvptutorial.repository.LoginRepository;
import com.titan.mvptutorial.repository.UserRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provideLoginActivityModel(LoginRepository repository){
        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new UserRepository();
    }
}
