package itbsu.java.labs.lab6;

import itbsu.java.labs.common.NumberOperators;
import itbsu.java.labs.common.Utils;

public class revertedNumber {

    public static void main(String[] args) {
        int number = Utils.scanValue("num");
        Utils.consoleLogStringInt("The number you want to revert = ", number);

        revertNumber(number);
        // Utils.consoleLog("This number is perfect, it's ", isPerfect(number));

    }

    public static void revertNumber(int number) {
        int length = NumberOperators.findQuantityOfNumberDigits(number);
        int[] array = NumberOperators.fillDigitsRevertedArray(number, length);
        // Utils.printArray(length, array);
        deleteNullElements(length, array);
        return;
    }

    public static int deleteNullElements(int length, int[] array) {
        String num = "";
        for (int i = 0; i < length; i++) {
            if (array[i] != 0) {
                num += array[i];
            }
        }
        Utils.consoleLogStringInt("Reverted number is  ", Integer.parseInt(num));
        return Integer.parseInt(num);
    }

}
