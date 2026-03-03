import java.util.Scanner;

public class PalindromeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (checker.checkPalindrome(input)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        sc.close();
    }
}