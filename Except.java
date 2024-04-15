import java.io.*;
public class Except {
    public static void main(String[] args) {
        try {
            methodWithException();
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    static void methodWithException() throws CustomException, IOException {
        // Method throwing exceptions
        try {
            // Code that may throw exceptions
            throw new CustomException("Custom exception occurred");
        } catch (IOException e) {
            throw e; // Re-throwing IOException
        }
    }
}

class CustomException extends Exception {
    // Custom exception class
    public CustomException(String message) {
        super(message);
    }
}

