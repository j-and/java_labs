package itbsu.java.labs.lab10;

public class Client {
    private String name;
    private User servant;
    private String desease;
    private String number;

    public Client(String name, User servant, String desease, String number) {
        this.name = name;
        this.servant = servant;
        this.desease = desease;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesease() {
        return desease;
    }

    public void setDesease(String desease) {
        this.desease = desease;
    }

    public User getServant() {
        return servant;
    }

    public void setServant(User servant) {
        this.servant = servant;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
