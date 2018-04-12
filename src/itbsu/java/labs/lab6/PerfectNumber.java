package itbsu.java.labs.lab6;

import java.util.ArrayList;

import itbsu.java.labs.common.ArrayOperators;
import itbsu.java.labs.common.Utils;

public class PerfectNumber {

    public static void main(String[] args) {
        int number = Utils.scanValue("num");
        Utils.consoleLogStringInt("The number you want to check = ", number);
        isPerfect(number);
        Utils.consoleLog("This number is perfect, it's ", isPerfect(number));
    }

    public static boolean isPerfect(int number) {
        boolean isPerfect = false;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < ArrayOperators.findDividers(number).length; i++) {
            arrayList.add(ArrayOperators.findDividers(number)[i]);
        }
        int sumArray = ArrayOperators.findSumArray(ArrayOperators.findDividers(number));
        Utils.consoleLogStringInt("sumArray = ", sumArray);
        if (number == sumArray) {
            isPerfect = true;
        }
        return isPerfect;
    }
}
