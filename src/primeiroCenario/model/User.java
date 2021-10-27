package primeiroCenario.model;

public class User implements IAuthenticable {
    int idUser;
    String user;
    String password;

    public User(int idUser, String user, String password) {
        this.idUser = idUser;
        this.user = user;
        this.password = password;
    }

    @Override
    public boolean getAuthenticated(String password) {
        return this.password == password;
    }

}
