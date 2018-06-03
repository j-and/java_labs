package itbsu.java.labs.lab10;

public class User {
    private String name;
    private String email;
    private String password;
    private int duration;

    public User(String name, String email, String password, int duration) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
