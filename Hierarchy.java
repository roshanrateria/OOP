
// Usage
public class Hierarchy {
    public static void main(String[] args) {
        Child1 child1Obj = new Child1();
        Child2 child2Obj = new Child2();

        child1Obj.parentMethod(); // Accessing method from parent class through Child1 object
        child1Obj.child1Method(); // Accessing method from Child1 class

        child2Obj.parentMethod(); // Accessing method from parent class through Child2 object
        child2Obj.child2Method(); // Accessing method from Child2 class
    }
}
// Parent class
class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

// Child1 class inheriting from Parent
class Child1 extends Parent {
    void child1Method() {
        System.out.println("Child1 method");
    }
}

// Child2 class inheriting from Parent
class Child2 extends Parent {
    void child2Method() {
        System.out.println("Child2 method");
    }
}

