
public class Abstract {
    public static void main(String[] args) {
        // Create an instance of the concrete class
        ConcreteClass obj = new ConcreteClass();
        
        // Call abstract method
        obj.abstractMethod();
        
        // Call concrete method
        obj.concreteMethod();
    }
}
abstract class AbstractClass {
    // Abstract method declaration
    abstract void abstractMethod();

    // Concrete method
    void concreteMethod() {
        System.out.println("This is a concrete method in the abstract class.");
    }
}

// Concrete subclass
class ConcreteClass extends AbstractClass {
    // Implementation of the abstract method
    void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }
}

