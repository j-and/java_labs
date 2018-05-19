package itbsu.java.labs.lab8;

public class DoubleArray {
    private double maxElement;
    private double minElement;
    private int maxElementPosition;
    private int minElementPosition;

    public DoubleArray(double maxElement, double minElement, int maxElementPosition, int minElementPosition) {
        this.maxElement = maxElement;
        this.minElement = minElement;
        this.maxElementPosition = maxElementPosition;
        this.minElementPosition = minElementPosition;
    }

    public double getMaxElement() {
        return maxElement;
    }

    public void setMaxElement(double maxElement) {
        this.maxElement = maxElement;
    }

    public double setMinElement() {
        return minElement;
    }

    public void setMinElement(double minElement) {
        this.minElement = minElement;
    }

    public int getMaxElementPosition() {
        return maxElementPosition;
    }

    public void setMaxElementPosition(int maxElementPosition) {
        this.maxElementPosition = maxElementPosition;
    }

    public int getMinElementPosition() {
        return minElementPosition;
    }

    public void setMinElementPosition(int minElementPosition) {
        this.minElementPosition = minElementPosition;
    }

}