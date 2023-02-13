package com.kgisl.springjd.Dao;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kgisl.springjd.entity.LoginModel;

@Repository
public class LoginmodelDaoImp implements LoginmodelDao{
       @Autowired
       private SessionFactory sessionFactory;

    @Override
    public List<LoginModel> getLoginModel() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < LoginModel > cq = cb.createQuery(LoginModel.class);
        Root < LoginModel > root = cq.from(LoginModel.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void saveLoginModel(LoginModel theLoginModel) {
        Session currentSession = sessionFactory.getCurrentSession();
              currentSession.saveOrUpdate(theLoginModel);
        
    }
   
         
              
       }

       
			 




