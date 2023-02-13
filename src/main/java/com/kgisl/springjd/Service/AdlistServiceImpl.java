package com.kgisl.springjd.Service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.springjd.Dao.Adlistdao;
import com.kgisl.springjd.entity.Adlist;

@Service
public class AdlistServiceImpl implements AdlistService{

    @Autowired
    private Adlistdao adlistdao;


    @Override
    @Transactional
    public List<Adlist> getAdlists() {
        
         return adlistdao.getAdlists();
    }

    @Override
    @Transactional
    public void saveAdlist(Adlist theAdlist) {
        adlistdao.saveAdlist(theAdlist);
        
    }

 

    @Override
    public void deleteAdlist(int theId) {
        adlistdao.deleteAdlist(theId);
        
    }

    @Override
    public Adlist getaAdlist(int theId) {
        return adlistdao.getaAdlist(theId);
    }
   
    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;
  
    public void setSessionFactory(SessionFactory sessionFactory) {
      this.sessionFactory = sessionFactory;
    }
  
    protected Session getSession() {
      return sessionFactory.openSession();
    }
  
    public boolean findUser(String username, String password){
      System.out.println("In Check login");
      Session session = sessionFactory.openSession();
      boolean userFound = false;
      //Query using Hibernate Query Language
      String SQL_QUERY ="from usermodel where username = ?1 and password =?2";
      Query query = session.createQuery(SQL_QUERY);
      query.setParameter(1,username);
      query.setParameter(2,password);
      List list = query.list();
      System.out.println(list);
      if ((list != null) && (list.size() > 0)) {
          userFound= true;
      }
      session.close();
      return userFound;              
  }   
}
