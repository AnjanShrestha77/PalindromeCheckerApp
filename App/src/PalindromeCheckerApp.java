

import java.util.*;

/**
 * main class - use case palindrome app
 *
 * use case 7: Deque Based Palindrome checker
 *
 * Description:
 * this class validates the palindrome using Deque (Doubly ended queue)
 *
 *  the application:
 *  pushes characters to deque
 *  remove the elements from the both sides and compare the result
 *  displays the result
 *
 *
 * @author  Anjan
 * @version 7.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        Deque<Character> deque=new ArrayDeque<>();

      //inserting into queue and stack
      for (char c: input.toCharArray()){
          deque.addFirst(c);
      }

      boolean isPalindrome=true;

      while (deque.size()>1){
            if(deque.removeFirst()!=deque.removeLast()){
              isPalindrome=false;
              break;
          }
      }

      //displaying the result
        System.out.println("input: "+input);
        System.out.println("is Palindrome? :"+isPalindrome);


    }
}