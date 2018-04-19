package itbsu.java.labs.lab7;

import itbsu.java.labs.common.Utils;

public class lab_7 {
    public static void main(String[] args) {
        Client ivanov = new Client("Ivanov", "stress", 35);
        Utils.consoleLogStrings("Client name is ", ivanov.getName());
        Visit visit1 = Registrator.registerVisit(ivanov, "11-05-2018");
        Utils.consoleLogStrings("The visit date is ", visit1.getDate());
    }
}
