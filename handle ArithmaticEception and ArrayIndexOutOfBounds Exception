package javafile;
public class Javafile{
        public static void main(String[] args) {
        try {
            int result = divide(10, 0); 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed.");
        }

        try {
            int[] arr = {1, 2, 3};
            int element = getElementAtIndex(arr, 5); 
            System.out.println("Element at index 5: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static int getElementAtIndex(int[] arr, int index) {
        return arr[index];
    }
}

