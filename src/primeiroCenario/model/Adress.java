package primeiroCenario.model;

import java.util.Objects;

public class Adress {
    int idAdress;
    String street;
    String city;
    String state;
    long zipCode;
    String country;

    public Adress(int idAdress, String street, String city, String state, long zipCode,
                  String country) {
        this.idAdress = idAdress;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    //getters e setters
    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return idAdress == adress.idAdress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdress);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "idAdress=" + idAdress +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", country='" + country + '\'' +
                '}';
    }
}
