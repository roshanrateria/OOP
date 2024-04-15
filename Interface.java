// Main class to test the implementation
public class Interface {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass obj = new MyClass();

        // Call methods defined in the interface
        obj.method1();
        obj.method2();
    }
}
interface MyInterface {
    void method1(); // Abstract method
    void method2(); // Another abstract method
}

// Implement the interface in a class
class MyClass implements MyInterface {
    public void method1() {
        // Implementation of method1
        System.out.println("Inside method1");
    }

    public void method2() {
        // Implementation of method2
        System.out.println("Inside method2");
    }
}

