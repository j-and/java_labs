package itbsu.java.labs.lab7;

public class Registrator {

    public static Visit registerVisit(Client client, String date) {

        Visit visit1 = new Visit(client.getName(), date);
        return visit1;
    }

}
