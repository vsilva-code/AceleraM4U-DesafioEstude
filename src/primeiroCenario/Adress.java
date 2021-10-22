package primeiroCenario;

public class Adress {
    int idAdress;
    String street;
    String city;
    String state;
    int zipCode;
    String country;
    Student student;

    public Adress(int idAdress, String street, String city, String state,
                  int zipCode, String country, Student student) {
        this.idAdress = idAdress;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
