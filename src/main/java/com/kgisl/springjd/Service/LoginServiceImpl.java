package com.kgisl.springjd.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.springjd.Dao.LoginDao;
import com.kgisl.springjd.entity.UserModel;
@Service

public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    @Override
    @Transactional
    public List<UserModel> getUserModels() {
        return loginDao.getUserModels();

    }

    @Override
    @Transactional
    public void saveUserModel(UserModel theUserModel) {
        loginDao.saveUserModel(theUserModel);
        
    }
    
    
}
