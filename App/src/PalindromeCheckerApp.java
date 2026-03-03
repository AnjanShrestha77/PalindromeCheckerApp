

import java.util.*;

/**
 * main class - use case palindrome app
 *
 * use case 10:Normalized Palindrome Validation
 *
 * Description:
 * this class validates the palindrome after processing the input string
 *
 *  the application:
 *  get the input string and convert it into lowercase
 *  remove the spaces and other characters from input string and form a normalized string
 *  check for palindrome and display the result
 *
 *
 * @author  Anjan
 * @version 10.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal panama";
        boolean isPalindrome=true;
        input=input.toLowerCase();
        String normalizedString ="";
        for(char c:input.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                normalizedString+=c;
            }
        }

        for(int i=0;i<normalizedString.length()-1;i++){
            if(normalizedString.charAt(i)!=normalizedString.charAt(normalizedString.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }



        System.out.println("input: "+input);
        System.out.println("is Palindrome? :"+isPalindrome);


    }
}