public class Wrapper {
    public static void main(String[] args) {
        // Wrapper classes for primitive data types
        Integer intObj = new Integer(10); // Integer wrapper class for int
        Double doubleObj = new Double(3.14); // Double wrapper class for double
        Character charObj = new Character('A'); // Character wrapper class for char
        Boolean boolObj = new Boolean(true); // Boolean wrapper class for boolean

        // Autoboxing: Converting primitive data types to wrapper objects automatically
        Integer autoBoxedInt = 20; // Autoboxing int to Integer
        Double autoBoxedDouble = 4.5; // Autoboxing double to Double

        // Unboxing: Converting wrapper objects to primitive data types automatically
        int unboxedInt = intObj.intValue(); // Unboxing Integer to int
        double unboxedDouble = doubleObj.doubleValue(); // Unboxing Double to double

        // Printing values
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);
        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Autoboxed Double: " + autoBoxedDouble);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
    }
}
