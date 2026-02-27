

import java.util.Stack;
/**
 * main class - use case palindrome app
 *
 * use case 4: Stack Based Palindrome checker
 * Description:
 * this class validates the palindrome using stack based data structure which follows LIFO
 *
 *  the application:
 *  pushes characters to stack
 *  pops in the revers order and compare with the string
 *  displays the result
 *
 *
 * @author  Anjan
 * @version 5.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";
      Stack<Character> stack=new Stack();

      for (char c: input.toCharArray()){
          stack.push(c);
      }

      boolean isPalindrome=true;

      for(char c: input.toCharArray()){
          if(c!=stack.pop()){
              isPalindrome=false;
              break;
          }
      }

        System.out.println("input: "+input);
        System.out.println("is Palindrome? :"+isPalindrome);


    }
}