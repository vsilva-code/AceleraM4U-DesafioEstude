package primeiroCenario.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    int idStudent;
    String name;
    int age;
    String email;
    List<Adress> adress;

    public Student(int idStudent, String name, int age, String email) {
        this.idStudent = idStudent;
        this.name = name;
        this.age = age;
        this.email = email;
        this.adress = new ArrayList<>();
    }

    public void addAdress(Adress adress) {
        this.adress.add(adress);
    }

    //getter and setters

    public int getIdStudent() {
        return idStudent;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Adress> getAdress() {
        return adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent);
    }
}
