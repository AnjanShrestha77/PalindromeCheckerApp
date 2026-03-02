

import java.util.*;

/**
 * main class - use case palindrome app
 *
 * use case 9:Recursive Palindrome checker
 *
 * Description:
 * this class validates the palindrome using Call Stack
 *
 *  the application:
 *  intialize start and end index of the string
 *  checks the element of starting index and ending index recursively
 *  displays the result
 *
 *
 * @author  Anjan
 * @version 9.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
       int start=0;
       int end=input.length()-1;


        System.out.println("input: "+input);
        System.out.println("is Palindrome? :"+isPalindrome(input,start,end));


    }
    public static boolean isPalindrome(String s, int start , int end){
        if (start>=end){
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s,start+1,end-1);

    }
}