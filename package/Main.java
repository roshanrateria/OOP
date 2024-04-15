// File: Main.java
import package.MyClass;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Accessing public variable
        obj.publicVar = 10;

        // Not accessible due to private access modifier
        // obj.privateVar = 20;

        // Not accessible outside package due to protected access modifier
        // obj.protectedVar = 30;

        // Accessing default variable (within the same package)
        obj.defaultVar = 40;

        // Accessing display method
        obj.display();
    }
}
