import java.math.BigInteger;
import java.util.Scanner;

public class  overloadF{

    // Recursive method to calculate factorial for int
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Overloaded method to calculate factorial for long integers
    public static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Overloaded method to calculate factorial for BigInteger
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        scanner.close();

        // Check if the entered number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate and display the factorial using int
            System.out.println("Factorial of " + number + " (using int) is: " + factorial(number));

            // Calculate and display the factorial using long
            System.out.println("Factorial of " + number + " (using long) is: " + factorial((long) number));

            // Calculate and display the factorial using BigInteger
            System.out.println("Factorial of " + number + " (using BigInteger) is: " + factorial(BigInteger.valueOf(number)));
        }
    }
}