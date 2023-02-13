package com.kgisl.springjd.Dao;

import java.util.List;

import com.kgisl.springjd.entity.UserModel;

public interface LoginDao{

    List<UserModel> getUserModels();

    void saveUserModel(UserModel theUserModel);

 
}
