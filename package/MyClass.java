package pack1;

public class MyClass {
    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    int defaultVar; // Default access modifier

    public void display() {
        System.out.println("Public variable: " + publicVar);
        System.out.println("Private variable: " + privateVar);
        System.out.println("Protected variable: " + protectedVar);
        System.out.println("Default variable: " + defaultVar);
    }
}
