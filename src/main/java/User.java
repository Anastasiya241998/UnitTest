public class User {
    String password;
    String email;
    String login;
    int age;

    public User(String password, String email, String login, int age){
        this.age = age;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}