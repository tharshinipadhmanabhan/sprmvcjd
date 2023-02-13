package com.kgisl.springjd.Dao;

import java.util.List;

import com.kgisl.springjd.entity.Adlist;


public interface Adlistdao {
 

    public  List<Adlist> getAdlists();
    

    public Adlist getaAdlist(int theId);

    public void saveAdlist(Adlist theAdlist);

    public void deleteAdlist(int theId);
}

