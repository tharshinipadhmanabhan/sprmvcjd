package com.kgisl.springjd.Service;

import java.util.List;

import com.kgisl.springjd.entity.Adlist;

public interface AdlistService {
    public List < Adlist > getAdlists();

    public void saveAdlist(Adlist theaAdlist);

    public Adlist getaAdlist(int theId);

    public void deleteAdlist(int theId);

    public boolean findUser(String username, String password);

}



