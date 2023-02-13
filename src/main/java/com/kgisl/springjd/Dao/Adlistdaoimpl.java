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
import com.kgisl.springjd.entity.Adlist;

@Repository
public class Adlistdaoimpl implements Adlistdao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Adlist>getAdlists() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Adlist > cq = cb.createQuery(Adlist.class);
        Root < Adlist > root = cq.from(Adlist.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void saveAdlist(Adlist theAdlist) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theAdlist);
        
    }

    @Override
    public Adlist getaAdlist(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Adlist theAdlist = currentSession.get(Adlist.class, theId);
        return theAdlist;
    }

    @Override
    public void deleteAdlist(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Adlist bk = session.byId(Adlist.class).load(theId);
        session.delete(bk);
    }

   

    // @Override
    // public List < Customer > getCustomers() {
    //     Session session = sessionFactory.getCurrentSession();
    //     CriteriaBuilder cb = session.getCriteriaBuilder();
    //     CriteriaQuery < Customer > cq = cb.createQuery(Customer.class);
    //     Root < Customer > root = cq.from(Customer.class);
    //     cq.select(root);
    //     Query query = session.createQuery(cq);
    //     return query.getResultList();
    // }

    // @Override
    // public void deleteCustomer(int id) {
    //     Session session = sessionFactory.getCurrentSession();
    //     Customer book = session.byId(Customer.class).load(id);
    //     session.delete(book);
    // }

    // @Override
    // public void saveCustomer(Customer theCustomer) {
    //     Session currentSession = sessionFactory.getCurrentSession();
    //     currentSession.saveOrUpdate(theCustomer);
    // }

    // @Override
    // public Customer getCustomer(int theId) {
    //     Session currentSession = sessionFactory.getCurrentSession();
    //     Customer theCustomer = currentSession.get(Customer.class, theId);
    //     return theCustomer;
    // }
}