package itbsu.java.labs.lab8;

import java.util.Arrays;
import java.util.Scanner;

import itbsu.java.labs.common.ArrayOperators;
import itbsu.java.labs.common.Utils;

public class lab_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Utils.scanValue(scanner, "arraySize");

        /* Integer array for common tasks */
        // int[] randomArray = ArrayOperators.fillArray(N, maxNumber);
        /* Double array and its characteristics for individual tasks */
        double[] randomArrayDouble = ArrayOperators.fillDoubleArray(N);
        double maxElement = ArrayOperators.findMaxElement(randomArrayDouble);
        double minElement = ArrayOperators.findMinElement(randomArrayDouble);
        int maxElementPosition = ArrayOperators.findMaxElementPosition(randomArrayDouble);
        int minElementPosition = ArrayOperators.findMinElementPosition(randomArrayDouble);

        DoubleArray doubleArray = new DoubleArray(maxElement, minElement, maxElementPosition, minElementPosition);
        System.out.printf("doubleArray[i] = " + Arrays.toString(randomArrayDouble));
        // findMaxElement(randomArray);
        // findMinElement(randomArray);
        // findAverageArifmetic(randomArray);
        // findAverageGeometric(randomArray);
        // isArraySorted(randomArray);
        // reverseArray(randomArray);
        // findLocalMin(randomArray);
        // findLocalMax(randomArray);
        // ind_task_1(randomArrayDouble, doubleArray);
        // ind_task_3(randomArrayDouble, doubleArray);
        ind_task_5(randomArrayDouble, doubleArray);

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

    public static void ind_task_1(double[] array, DoubleArray doubleArray) {
        double negativeSum = ArrayOperators.findSumArrayDouble(ArrayOperators.findNegativeElements(array));
        Utils.consoleLogStringDouble("negativeSum= ", negativeSum);
        int start = doubleArray.getMinElementPosition();
        int end = doubleArray.getMaxElementPosition();
        if (end < start) {
            int temp = start;
            start = end;
            end = temp;
        }
        double multipleMinMax = ArrayOperators.findMultiplyArrayDouble(start, end, array);
        Utils.consoleLogStringDouble("Multiple between min and max elements = ", multipleMinMax);
    }

    public static void ind_task_3(double[] array, DoubleArray doubleArray) {
        double maxElement = ArrayOperators.findMaxElement(array);
        Utils.consoleLogStringDouble("maxElement= ", maxElement);

        double[] positiveArray = ArrayOperators.findPositiveElements(array);
        int i = 0;
        for (i = array.length - 1; i > 0; i--) {
            if (array[i] == positiveArray[i]) {
                break;
            }
        }
        double[] cutArray = ArrayOperators.findCutArrayDouble(array, 0, i);
        double sumDouble = ArrayOperators.findSumArrayDouble(cutArray);
        Utils.consoleLogStringDouble("sumDouble= ", sumDouble);
    }

    public static void ind_task_5(double[] array, DoubleArray doubleArray) {

        double[] squareArray = new double[array.length];
        for (int i = 0; i < squareArray.length; i++) {
            squareArray[i] = Math.pow(array[i], 2);
        }

        double maxElementAbs = Math.pow(ArrayOperators.findMaxElement(squareArray), 0.5);
        Utils.consoleLogStringDouble("maxElementAbs= ", maxElementAbs);

        double sumDouble = 0;
        int i = 0, j = 0;

        for (i = 0; i < array.length; i++) {
            if (array[i] == ArrayOperators.findPositiveElements(array)[i]) {
                break;
            }
        }

        if (ArrayOperators.findPositiveElementsLength(array) > 1) {
            double[] cutArray = ArrayOperators.findCutArrayDouble(array, i + 1, array.length - 1);
            int k = array.length - cutArray.length;

            for (j = 0; j < cutArray.length; j++) {
                if (cutArray[j] == ArrayOperators.findPositiveElements(cutArray)[j] && cutArray[j] != 0) {
                    cutArray = ArrayOperators.findCutArrayDouble(array, i, j + k);
                    sumDouble = ArrayOperators.findSumArrayDouble(cutArray);
                    break;
                }

                else {
                    sumDouble = array[i];
                }
            }
        }

        else {
            sumDouble = 0;
        }

        Utils.consoleLogStringDouble("sumDouble= ", sumDouble);
    }
}