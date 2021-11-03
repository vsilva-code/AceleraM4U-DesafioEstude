package com.example.estude.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAdress;
    @Column(nullable=false)
    private String country;
    @Column(nullable=false)
    private String city;
    @Column(nullable=false)
    private String state;
    @Column(nullable=false)
    private String street;
    

    public Integer getIdAdress() {
        return idAdress;
    }
    public void setIdAdress(Integer idAdress) {
        this.idAdress = idAdress;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    
    

    
}
