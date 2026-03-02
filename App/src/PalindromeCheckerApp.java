

import java.util.*;

/**
 * main class - use case palindrome app
 *
 * use case 8: Linked list  Based Palindrome checker
 *
 * Description:
 * this class validates the palindrome using Linked list
 *
 *  the application:
 *  pushes characters to linked list
 *  checks the first and last element of the list and continue
 *  displays the result
 *
 *
 * @author  Anjan
 * @version 8.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        LinkedList<Character> list=new LinkedList<>();

      //inserting into queue and stack
      for (char c: input.toCharArray()){
        list.add(c);
      }

      boolean isPalindrome=true;

      while (list.size()>1){

            if(list.removeFirst()!=list.removeLast()){
              isPalindrome=false;
              break;
          }
      }

      //displaying the result
        System.out.println("input: "+input);
        System.out.println("is Palindrome? :"+isPalindrome);


    }
}