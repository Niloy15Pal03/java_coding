import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Advanced Calculator!");
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Power (^)");
        System.out.println("7. Square Root (√)");

        System.out.print("Enter your choice (1-7): ");
        int choice = scanner.nextInt();

        double num1 = 0, num2 = 0, result = 0;

        if (choice >= 1 && choice <= 6) {
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
        } else if (choice == 7) {
            System.out.print("Enter the number: ");
            num1 = scanner.nextDouble();
        } else {
            System.out.println("Invalid choice! Please restart the program.");
            scanner.close();
            return;
        }

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                result = num1 % num2;
                System.out.println("Result: " + result);
                break;
            case 6:
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 7:
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot compute square root of a negative number.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        scanner.close();
        System.out.println("Thank you for using the Advanced Calculator!");
    }
}
