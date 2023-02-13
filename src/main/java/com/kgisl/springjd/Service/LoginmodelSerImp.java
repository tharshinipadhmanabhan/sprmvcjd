package com.kgisl.springjd.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.springjd.Dao.LoginmodelDao;
import com.kgisl.springjd.entity.LoginModel;

@Service
public class LoginmodelSerImp implements Loginmodelservice 
{
    @Autowired
    private LoginmodelDao loginmodelDao;
    
    @Override
    @Transactional
    public List<LoginModel> getLoginModel() 
    {
        return loginmodelDao.getLoginModel();
    }
   
    @Override
    public void saveLoginModel(LoginModel theLoginModel) 
    {
        loginmodelDao.saveLoginModel(theLoginModel);
    }
}
