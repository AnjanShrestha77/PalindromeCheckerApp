/** MAIN CLASS - UseCase12PalindromeCheckerApp

 Use Case 12: Strategy Pattern for Palindrome Algorithms

 Description:
 This class demonstrates how different palindrome
 validation algorithms can be selected dynamically
 at runtime using the Strategy Design Pattern.

 At this stage, the application:

 Defines a common PalindromeStrategy interface

 Implements a concrete Stack based strategy

 Injects the strategy at runtime

 Executes the selected algorithm

 No performance comparison is done in this use case.
 The focus is purely on algorithm interchangeability.


 @author Anjan
 @version 12.0
 */
import java.util.*;

public class PalindromeCheckerApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Choose Strategy:");
            System.out.println("1. Stack Strategy");
            System.out.println("2. Deque Strategy");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            PalindromeStrategy strategy;

            if (choice == 1) {
                strategy = new StackStrategy();
            } else {
                strategy = new DequeStrategy();
            }

            PalindromeService service = new PalindromeService(strategy);

            boolean result = service.validate(input);

            System.out.println("Is Palindrome? : " + result);

            sc.close();
        }
    }

