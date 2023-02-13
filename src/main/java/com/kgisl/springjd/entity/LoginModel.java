package com.kgisl.springjd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="loginmodel")

public class LoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String Name;
    private int MobileNumber;
    
    public String getName() {
        return Name ;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getMobileNumber() {
        return MobileNumber;
    }
    public void setMobileNumber(int MobileNumber) {
        this.MobileNumber = MobileNumber;
    }
  
}
