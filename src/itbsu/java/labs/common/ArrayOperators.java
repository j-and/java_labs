package itbsu.java.labs.common;

public class ArrayOperators {

    public static int[] findDividers(int number) {
        int[] dividers = new int[number];
        int i;
        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                dividers[i] = i;
                // Utils.consoleLogStringInt("divider= ", i);
            } else {
                dividers[i] = 0;
            }
        }
        return dividers;
    }

    public static int getSumArray(int[] elements) {
        int sumArray = 0;
        for (int i = 0; i < elements.length; i++) {
            sumArray += elements[i];
        }
        return sumArray;
    }

}
