package com.kgisl.springjd.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Adlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private int id;
    private String a_name;
    private long phoneNo;
    private int flatNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private int pincode;
    private String category;
    private String sub_category;
    private String open_time;
    private String close_time;
    private int ratings;
    
  
    public String getA_name() 
    {
        return a_name;
    }
    public void setA_name(String a_name) 
    {
        this.a_name = a_name;
    }
    public long getPhoneNo() 
    {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) 
    {
        this.phoneNo = phoneNo;
    }
    public int getFlatNo() 
    {
        return flatNo;
    }
    public void setFlatNo(int flatNo) 
    {
        this.flatNo = flatNo;
    }
    public String getStreet() 
    {
        return street;
    }
    public void setStreet(String street) 
    {
        this.street = street;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }
    public String getState() 
    {
        return state;
    }
    public void setState(String state) 
    {
        this.state = state;
    }
    public String getCountry() 
    {
        return country;
    }
    public void setCountry(String country) 
    {
        this.country = country;
    }
    public int getPincode() 
    {
        return pincode;
    }
    public void setPincode(int pincode) 
    {
        this.pincode = pincode;
    }
    public String getCategory() 
    {
        return category;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }
    public String getSub_category() 
    {
        return sub_category;
    }
    public void setSub_category(String sub_category)
    {
        this.sub_category = sub_category;
    }
    public String getOpen_time() 
    {
        return open_time;
    }
    public void setOpen_time(String open_time) 
    {
        this.open_time = open_time;
    }
    public String getClose_time() 
    {
        return close_time;
    }
    public void setClose_time(String close_time) 
    {
        this.close_time = close_time;
    }
    public int getRatings() 
    {
        return ratings;
    }
    public void setRatings(int ratings) 
    {
        this.ratings = ratings;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id= id;
    }
}