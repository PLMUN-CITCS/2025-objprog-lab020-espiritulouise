import java.util.Scanner;

public class Main { // Ensure your file is named Main.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Greet User");
            System.out.println("2. Check Even/Odd");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt(); // Get user choice

            if (choice == 1) {
                System.out.println("Hello! Welcome!\n");
            } else if (choice == 2) {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                System.out.println(number + " is an " + (number % 2 == 0 ? "Even" : "Odd") + " number.\n");
            } else if (choice == 3) {
                System.out.println("Exiting program. Goodbye!");
                break; // Exit loop
            } else {
                System.out.println("Invalid choice! Please enter a number between 1 and 3.\n");
            }
        }

        scanner.close();
    }
}
