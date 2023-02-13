package com.kgisl.springjd.Dao;

import java.util.List;

import com.kgisl.springjd.entity.LoginModel;

public interface LoginmodelDao
{

    List<LoginModel> getLoginModel();

    void saveLoginModel(LoginModel theLoginModel);

}
