package itbsu.java.labs.lab7;

public class Client {
    private String name;
    private String desease;
    private int age;

    public Client(String name, String desease, int age) {
        this.name = name;
        this.desease = desease;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
