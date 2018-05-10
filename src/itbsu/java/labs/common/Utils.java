package itbsu.java.labs.common;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static void main(String[] args) {
    }

    public static int scanValue(String value) {
        return scanValue(new Scanner(System.in), value);
    }

    public static int scanValue(Scanner scanner, String value) {
        consoleLogStrings("Please, enter ", value);
        int num = scanner.nextInt();
        return num;
    }

    public static char scanChar(String value) {
        Scanner scanner = new Scanner(System.in);
        consoleLogStrings("Please, enter ", value);
        char character = scanner.next().toUpperCase().charAt(0);
        scanner.close();
        return character;
    }

    public static int findRandom(int max) {
        Random rand = new Random();
        int randomValue = rand.nextInt(max) + 1;
        // consoleLogStringInt("Random value is ", randomValue);
        return randomValue;
    }

    public static int findSum(int num1, int num2) {
        int sum = num1 + num2;
        consoleLogStringInt("Sum is ", sum);
        return sum;
    }

    public static void consoleLog(String text, boolean value) {
        System.out.printf(text + value + "\n");
    }

    public static void consoleLogStrings(String text1, String text2) {
        System.out.printf(text1 + text2 + "\n");
    }

    public static void consoleLogStringInt(String text, int num) {
        System.out.printf(text + num + "\n");
    }

    public static void printArray(int length, int[] array) {
        for (int i = 0; i < length; i++) {
            consoleLogStringInt("array[i]= ", array[i]);
        }
        return;
    }

}
