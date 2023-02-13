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

import com.kgisl.springjd.entity.UserModel;

@Repository
public class LoginDaoImpl implements LoginDao{
       @Autowired
       private SessionFactory sessionFactory;
   
       @Override
       public List<UserModel> getUserModels() {
              Session session = sessionFactory.getCurrentSession();
              CriteriaBuilder cb = session.getCriteriaBuilder();
              CriteriaQuery < UserModel > cq = cb.createQuery(UserModel.class);
              Root < UserModel > root = cq.from(UserModel.class);
              cq.select(root);
              Query query = session.createQuery(cq);
              return query.getResultList();
       }

     

       @Override
       public void saveUserModel(UserModel theUserModel) {
              Session currentSession = sessionFactory.getCurrentSession();
              currentSession.saveOrUpdate(theUserModel);
              
              
       }

       
			 



}
