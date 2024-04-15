
public class Polymorphism {
    public static void main(String[] args) {
        // Creating objects of both parent and child class
        Parent parentObj = new Parent();
        Child childObj = new Child();

        // Calling the display method of Parent class using parentObj
        parentObj.display();

        // Calling the display method of Child class using childObj
        childObj.display();

        // Polymorphism: parent reference pointing to child object
        Parent polymorphicObj = new Child();
        polymorphicObj.display(); // Calls the display method of Child class
    }
}

// Parent class
class Parent {
    void display() {
        System.out.println("This is the display method in the Parent class");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    // Method overriding
    void display() {
        System.out.println("This is the display method in the Child class");
    }
}
