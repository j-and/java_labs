package itbsu.java.labs.lab6;

import java.util.Scanner;

import itbsu.java.labs.common.ArrayOperators;
import itbsu.java.labs.common.NumberOperators;
import itbsu.java.labs.common.Utils;

public class findDigitsSumCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Utils.getValue(scanner, "num");
        int number1 = Utils.getValue(scanner, "num1");
        int[] array = NumberOperators.fillDigitsRevertedArray(number,
                NumberOperators.findQuantityOfNumberDigits(number));
        // findDigitsSumCount1(number, array);
        // findDifferentDigits(number, array);
        // findMaxDigit(number, array);
        // isPalindrom(number, array);
        // isPrime(number);
        // findPrimeDividers(number);
        // int a = 20;
        // int b = 50;
        greatestCommonDivisor(number, number1);
        // leastCommonMultiple(a, b);
    }

    public static void findDigitsSumCount1(int number, int[] array) {

        Utils.consoleLogStringInt("You count digits count and their sum for number ", number);
        Utils.consoleLogStringInt("Count of digits is ", NumberOperators.findQuantityOfNumberDigits(number));
        Utils.consoleLogStringInt("Sum of digits is ", ArrayOperators.getSumArray(array));
    }

    public static void findDifferentDigits(int number, int[] array) {
        Utils.consoleLogStringInt("You find different digits of number ", number);
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
        Utils.consoleLogStringInt("You find max digit of number ", number);
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }

        Utils.consoleLogStringInt("Max digit = ", max);
    }

    public static void isPalindrom(int number, int[] array) {
        Utils.consoleLogStringInt("You check is palindrom for number ", number);
        boolean isPalindrom = false;
        int i = 0;
        while (array[i] == array[array.length - i - 1] && i < array.length / 2) {
            i++;
            isPalindrom = true;
        }
        Utils.consoleLog("This number is palindrom, it's ", isPalindrom);
    }

    public static boolean isPrime(int number) {
        Utils.consoleLogStringInt("You check is prime for number ", number);
        int[] dividers = ArrayOperators.findDividers(number);
        boolean isPrime = (ArrayOperators.getSumArray(dividers) > 1) ? false : true;
        Utils.consoleLog("This number is prime, it's ", isPrime);
        return isPrime;
    }

    public static void findPrimeDividers(int number) {
        Utils.consoleLogStringInt("You find prime dividers for number ", number);
        int[] dividers = ArrayOperators.findDividers(number);
        int[] primeDividers = new int[number];
        for (int i = 0; i < dividers.length; i++) {
            if (isPrime(dividers[i]) == true) {
                primeDividers[i] = dividers[i];
                Utils.consoleLogStringInt("Prim divider =  ", primeDividers[i]);
            }
        }

    }

    public static int greatestCommonDivisor(int a, int b) {

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }

            Utils.consoleLogStringInt("a+b  =  ", a + b);
        }
        return a + b;
    }

    public static void leastCommonMultiple(int a, int b) {
        Utils.consoleLogStringInt("leastCommonMultiple = ", a * b / greatestCommonDivisor(a, b));
    }
}
