
import java.util.Scanner;

public class factorial{

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        // Base case: if n is 0 or 1, return 1 (base case of factorial)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: multiply n with factorial of (n-1)
            return n * factorial(n - 1);
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
            // Calculate and display the factorial
            System.out.println("Factorial of " + number + " is: " + factorial(number));
        }
    }
}
