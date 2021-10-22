package primeiroCenario;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int idStudent;
    String name;
    int age;
    String email;
    List<User> users;
    List<Adress> adress;

    public Student(int idStudent, String name, int age, String email) {
        this.idStudent = idStudent;
        this.name = name;
        this.age = age;
        this.email = email;
        this.users = users = new ArrayList<>();
        this.adress = adress = new ArrayList<>();
    }

    public int getIdStudent() {
        return idStudent;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Adress> getAdress() {
        return adress;
    }
}
