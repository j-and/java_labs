package itbsu.java.labs.common;

public class NumberOperators {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static int findQuantityOfNumberDigits(int number) {
        int quantity = 1;
        number = number > 0 ? number : -number;
        while (number > 9) {
            quantity++;
            number /= 10;
        }
        return quantity;
    }

    public static int[] fillDigitsRevertedArray(int number, int quantity) {

        int temp = number;
        int[] revertedArray = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            if (temp > 0) {
                revertedArray[i] = temp % 10;
                temp /= 10;
            }
        }
        return revertedArray;
    }
}
