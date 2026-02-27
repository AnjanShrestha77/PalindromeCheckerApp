
/**
 * main class - use case palindrome app
 *
 * use case 4: Character Array Based Validation
 * description
 * this class validates by converting the string into character array and comparing characters using the two pointer techinque
 * the application:
 * convert the input string into character array using .tocharArray()
 * use start and end pointers
 *compares character efficiently
 * display the result
 *
 * @author  Anjan
 * @version 4.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        char[] chars= input.toCharArray();
        int start=0;
        int end=chars.length-1;
        boolean isPalindrome=true;
        while (start<end){
            if(chars[start]!=chars[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("input: "+ input);
        if(isPalindrome){
            System.out.println("is Panlindrome? true");
        }
        else
            System.out.println("is Panlindrome? false");
    }
}