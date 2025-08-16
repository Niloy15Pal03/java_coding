import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int result = 0;
        int digits = 0;

        // Count the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }

        originalNumber = number;

        // Calculate the sum of the power of digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
