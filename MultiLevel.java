public class MultiLevel {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.grandparentMethod(); // Accessing method from grandparent class
        childObj.parentMethod(); // Accessing method from parent class
        childObj.childMethod(); // Accessing method from child class
    }
}
// Grandparent class
class Grandparent {
    void grandparentMethod() {
        System.out.println("Grandparent method");
    }
}

// Parent class inheriting from Grandparent
class Parent extends Grandparent {
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


