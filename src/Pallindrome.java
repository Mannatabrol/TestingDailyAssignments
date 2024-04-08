import java.util.Scanner;

public class Pallindrome {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

    // Overloaded method to check if an integer is a palindrome
    public static boolean isPalindrome(int num) {
        return isPalindrome(Integer.toString(num));
    }

    // Overloaded method to check if a long integer is a palindrome
    public static boolean isPalindrome(long num) {
        return isPalindrome(Long.toString(num));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        scanner.close();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}
