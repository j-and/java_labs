package itbsu.java.labs.lab6;

import itbsu.java.labs.common.ArrayOperators;
import itbsu.java.labs.common.Utils;

public class PerfectNumber {

    public static void main(String[] args) {
        int number = Utils.getValue("num");
        Utils.consoleLogStringInt("The number you want to check = ", number);
        isPerfect(number);
        Utils.consoleLog("This number is perfect, it's ", isPerfect(number));
    }

    public static boolean isPerfect(int number) {
        boolean isPerfect = false;
        int[] dividers = ArrayOperators.findDividers(number);
        int sumArray = ArrayOperators.getSumArray(dividers);
        Utils.consoleLogStringInt("sumArray = ", sumArray);
        if (number == sumArray) {
            isPerfect = true;
        }
        return isPerfect;
    }
}
