package javafile;

public class Javafile {

    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative!");
        }
    }

    public static void main(String[] args) {
        Javafile javaFile = new Javafile();

        try {
            int value = -10;
            javaFile.checkValue(value);
            System.out.println("Value is valid: " + value);
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
