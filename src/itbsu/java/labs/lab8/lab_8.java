package itbsu.java.labs.lab8;

import java.util.Random;
import java.util.Scanner;

import itbsu.java.labs.common.ArrayOperators;
import itbsu.java.labs.common.Utils;

public class lab_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Utils.scanValue(scanner, "arraySize");

        int maxNumber = 100;
        int[] randomArray = fillArray(N, maxNumber);
        findMaxElement(randomArray);
        findMinElement(randomArray);
        findAverageArifmetic(randomArray);
        findAverageGeometric(randomArray);
        isArraySorted(randomArray);
        reverseArray(randomArray);
        findLocalMin(randomArray);
        findLocalMax(randomArray);

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

    public static int findMaxElement(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        // System.out.printf("maxElement = " + maxElement);
        return maxElement;
    }

    public static int findMinElement(int[] array) {
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
            }
        }
        // System.out.printf("minElement = "+ minElement);
        return minElement;
    }

    public static void findAverageArifmetic(int[] array) {
        System.out.printf("Average Arifmetic = " + ArrayOperators.findSumArray(array) / array.length);
    }

    public static void findAverageGeometric(int[] array) {

        int sum = array[0];

        for (int i = 1; i < array.length; i++) {
            sum *= array[i];
        }
        System.out.printf("Average Geometric = " + Math.pow(sum, 1.0 / array.length));
    }

    public static void isArraySorted(int[] array) {

        if (array.length >= 2) {
            isOrdered(array);
            isOrdered(reverseArray(array));
            System.out.printf("isSorted= " + isOrdered(array));
        } else {
            System.out.printf("Too short array to compare= ");
        }
    }

    public static boolean isOrdered(int[] array) {
        boolean isSorted = false;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[0] - array[1]) > 0) {
                if (array[i] - array[i + 1] >= 0) {
                    isSorted = true;
                } else {
                    isSorted = false;
                    break;
                }
            }
        }
        return isSorted;
    }

    public static int[] reverseArray(int[] a) {
        int middle = a.length / 2;
        int i = 0, j = a.length - 1, temp = 0;

        for (; i < middle; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }

    public static int findLocalMin(int[] a) {
        int localMin = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] <= a[i - 1]) {
                if (a[i] <= a[i + 1]) {
                    localMin = a[i];
                } else {
                    localMin = a[i - 1];
                }
            }
        }
        System.out.printf("localMin= " + localMin);
        return localMin;
    }

    public static int findLocalMax(int[] a) {
        int localMax = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] >= a[i - 1]) {
                if (a[i] >= a[i + 1]) {
                    localMax = a[i];
                } else {
                    localMax = a[i - 1];
                }
            }
        }
        System.out.printf("localMax= " + localMax);
        return localMax;
    }

}
