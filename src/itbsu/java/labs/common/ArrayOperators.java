package itbsu.java.labs.common;

import java.util.ArrayList;

public class ArrayOperators {

    public static int[] findDividers(int number) {
        ArrayList<Integer> dividers = new ArrayList<Integer>();
        int i;
        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                dividers.add(i);
            }
        }
        return fillArrayWithoutNulls(dividers);
    }

    public static int[] fillArrayWithoutNulls(ArrayList<Integer> array) {
        int i;
        int[] arrayInt = new int[array.size()];
        for (i = 0; i < array.size(); i++) {
            arrayInt[i] = array.get(i);
        }
        return arrayInt;
    }

    public static int findSumArray(int[] elements) {
        int sumArray = 0;
        for (int i = 0; i < elements.length; i++) {
            sumArray += elements[i];
        }
        return sumArray;
    }

}
