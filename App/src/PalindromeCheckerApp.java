

/**
Use Case 11: Object-Oriented Palindrome Service

Description:
This class demonstrates palindrome validation using
        object-oriented design.

The palindrome logic is encapsulated inside a
PalindromeService class.

This improves:

Reusability
 Readability
 Separation of concerns

@author Anjan
@version 11.0
*/

import java.util.Stack;

class PalindromeCheckerApp {

    // Encapsulated method
    public boolean checkPalindrome(String input) {

        // Null check
        if (input == null) {
            return false;
        }

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }

        // Compare by popping
        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}