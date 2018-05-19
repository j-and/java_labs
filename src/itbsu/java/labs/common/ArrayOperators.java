package itbsu.java.labs.common;

import java.util.ArrayList;
import java.util.Random;

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

    public static int[] fillArray(int N, int max) {
        Random rand = new Random();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            int randomValue = rand.nextInt(max) + 1;
            array[i] = randomValue;
            // System.out.printf("array[i] = " + array[i]);
        }
        return array;
    }

    public static double[] fillArrayWithDouble(int N) {
        Random rand = new Random();
        double[] array = new double[N];

        for (int i = 0; i < N; i++) {
            // double randomValue = rand.nextDouble() * (upper - lower) + lower;

            int number = rand.nextInt(-10) + 1;// gets a random integer out of 35
            double randDouble = rand.nextDouble();// gets a random double
            double randomValue = ((number + randDouble) - 10) / 100;

            array[i] = randomValue;
            // System.out.printf("array[i] = " + array[i]);
        }

        return array;
    }

    public static int findSumArray(int[] elements) {
        int sumArray = 0;
        for (int i = 0; i < elements.length; i++) {
            sumArray += elements[i];
        }
        return sumArray;
    }

    public static double findSumArrayDouble(double[] elements) {
        double sumArray = 0;
        for (int i = 0; i < elements.length; i++) {
            sumArray += elements[i];
        }
        return sumArray;
    }

    public static double findMultiplyArrayDouble(int start, int end, double[] elements) {
        double multArray = 1;
        // System.out.printf("start= " + start + "; end= " + end);
        for (int i = start; i < end; i++) {
            if (elements[i] != 0) {
                multArray *= elements[i];
            }
        }
        return multArray;
    }

    public static double[] findNegativeElements(double[] array) {
        double[] negativeArray = new double[array.length];
        for (int i = 0; i < negativeArray.length; i++) {
            if (array[i] < 0) {
                negativeArray[i] = array[i];
            }
            // System.out.printf("negativeArray[i]= " + negativeArray[i]);
        }
        return negativeArray;
    }

    public static double[] findPositiveElements(double[] array) {
        double[] positiveArray = new double[array.length];
        for (int i = 0; i < positiveArray.length; i++) {
            if (array[i] > 0) {
                positiveArray[i] = array[i];
            }
            // System.out.printf("positiveArray[i]= " + positiveArray[i]);
        }
        return positiveArray;
    }

    public static double[] fillDoubleArray(int length) {
        double[] array = new double[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextDouble();
        }
        return array;
    }

    public static double findMaxElement(double[] array) {
        double maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static double findMinElement(double[] array) {
        double minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    public static int findMaxElementPosition(double[] array) {
        double maxElement = findMaxElement(array);
        int i = 0;
        while (array[i] != maxElement) {
            i++;
        }
        System.out.printf("maxElementPosition= " + i);
        return i;
    }

    public static int findMinElementPosition(double[] array) {
        double minElement = findMinElement(array);
        int i = 0;
        while (array[i] != minElement) {
            i++;
        }
        System.out.printf("minElementPosition= " + i);
        return i;

    }

}