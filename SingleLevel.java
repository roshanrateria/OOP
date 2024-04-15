public class SingleLevel {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.parentMethod(); // Accessing method from parent class
        childObj.childMethod(); // Accessing method from child class
    }
}

// Parent class
class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    void childMethod() {
        System.out.println("Child method");
    }
}

