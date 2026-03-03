import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        if (input == null) return false;

        String cleaned = input.replaceAll("\\W", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}