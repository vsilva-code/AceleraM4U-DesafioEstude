package primeiroCenario;

public class User extends Student {
    int idUser;
    String user;
    String password;

    public User(int idStudent, String name, int age, String email) {
        super(idStudent, name, age, email);
    }

    public int getStudent() {
        return super.idStudent;
    }
}
