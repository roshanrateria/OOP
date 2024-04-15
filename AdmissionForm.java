import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdmissionForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Admission Form!");
        System.out.println("Please fill in the following details:");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your desired course: ");
        String course = scanner.nextLine();

        // Create a FileWriter to write the data to a file
        try (FileWriter writer = new FileWriter("admission_details.txt")) {
            // Write the details to the file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Address: " + address + "\n");
            writer.write("Desired Course: " + course + "\n");

            System.out.println("Admission Form submitted successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
