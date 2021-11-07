package com.example.estude.model;

import javax.persistence.*;


@Entity
public class Address {

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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "student_id")
    private Student student;


    public Integer getIdAddress() {
        return idAdress;
    }

    public void setIdAddress(Integer idAdress) {
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
