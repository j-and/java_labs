package itbsu.java.labs.lab6;

import java.util.ArrayList;
import java.util.Scanner;

import itbsu.java.labs.common.ArrayOperators;
import itbsu.java.labs.common.NumberOperators;
import itbsu.java.labs.common.Utils;

public class findDigitsSumCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Utils.scanValue(scanner, "num");
        int number1 = Utils.scanValue(scanner, "num1");
        int[] numbersArray = NumberOperators.fillDigitsRevertedArray(number,
                NumberOperators.findQuantityOfNumberDigits(number));
        findDigitsSumCount1(number, numbersArray);
        findDifferentDigits(number, numbersArray);
        findMaxDigit(number, numbersArray);
        isPalindrom(number, numbersArray);
        isPrime(number);
        findPrimeDividers(number);

        greatestCommonDivisor(number, number1);
        leastCommonMultiple(number, number1);
    }

    public static void findDigitsSumCount1(int number, int[] array) {
        Utils.consoleLogStringInt("Count of digits is ", NumberOperators.findQuantityOfNumberDigits(number));
        Utils.consoleLogStringInt("Sum of digits is ", ArrayOperators.findSumArray(array));
    }

    public static void findDifferentDigits(int number, int[] array) {
        int count = 0;
        int[] digitsArray = new int[10];
        for (int i = 0; i < array.length; i++) {
            digitsArray[array[i]]++;
        }
        for (int c = 0; c <= 9; c++) {
            if (digitsArray[c] > 0) {
                count++;
            }
        }
        Utils.consoleLogStringInt("Count of different digits ", count);
    }

    public static void findMaxDigit(int number, int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }

        Utils.consoleLogStringInt("Max digit = ", max);
    }

    public static void isPalindrom(int number, int[] array) {
        boolean isPalindrom = false;
        int i = 0;
        while (array[i] == array[array.length - i - 1] && i < array.length / 2) {
            i++;
            isPalindrom = true;
        }
        Utils.consoleLog("This number is palindrom, it's ", isPalindrom);
    }

    public static boolean isPrime(int number) {
        int[] dividers = ArrayOperators.findDividers(number);
        boolean isPrime = (ArrayOperators.findSumArray(dividers) > 1) ? false : true;
        Utils.consoleLog("This number is prime, it's ", isPrime);
        return isPrime;
    }

    public static void findPrimeDividers(int number) {
        int[] dividers = ArrayOperators.findDividers(number);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < dividers.length; i++) {
            if (isPrime(dividers[i]) && dividers[i] != 0) {
                arrayList.add(dividers[i]);
            }
        }

        int[] primeDividers = ArrayOperators.fillArrayWithoutNulls(arrayList);
        Utils.printArray(primeDividers.length, primeDividers);
    }

    public static int greatestCommonDivisor(int a, int b) {

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }

            Utils.consoleLogStringInt("The greatest common divisor is ", a + b);
        }
        return a + b;
    }

    public static void leastCommonMultiple(int a, int b) {
        Utils.consoleLogStringInt("The least common multiple is ", a * b / greatestCommonDivisor(a, b));
    }
}
