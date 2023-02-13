package com.kgisl.springjd.Service;

import java.util.List;

import com.kgisl.springjd.entity.UserModel;

public interface LoginService {

    List<UserModel> getUserModels();

    void saveUserModel(UserModel theUserModel);
    
}
