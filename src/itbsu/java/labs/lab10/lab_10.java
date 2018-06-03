package itbsu.java.labs.lab10;

public class lab_10 {
    public static void main(String[] args) {

        User doctor = new User("Doctor Do", "doctorDo@mail.ru", "pass", 60);
        Client ivanov = new Client("Ivan Ivanov", doctor, "bad teeth", "+375291116371");
        // Registration visit1 = new Registration(doctor, ivanov, 111022512, ACTIVE,
        // doctor.getDuration());

    }
}
