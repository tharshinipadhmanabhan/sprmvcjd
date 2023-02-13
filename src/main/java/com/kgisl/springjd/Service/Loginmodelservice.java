package com.kgisl.springjd.Service;

import java.util.List;

import com.kgisl.springjd.entity.LoginModel;

public interface Loginmodelservice
{

    List<LoginModel> getLoginModel();

    void saveLoginModel(LoginModel theLoginModel);
    
}
