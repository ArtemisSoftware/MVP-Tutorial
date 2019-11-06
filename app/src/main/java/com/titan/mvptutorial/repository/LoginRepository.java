package com.titan.mvptutorial.repository;


import com.titan.mvptutorial.model.User;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
