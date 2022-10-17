package models;

public class User {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public User withEmail(String email) { //previous set email
        this.email = email;
        return this;//returns himself
        // or return new User();


    }

    public String getPassword() {
        return password;
    }

    public User withPassword(String password) {//previous set password
        this.password = password;
        return this;
    }



    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
