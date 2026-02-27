

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * main class - use case palindrome app
 *
 * use case 6: Stack and Queue Based Palindrome checker
 *
 * Description:
 * this class validates the palindrome using two data structure:
 * Queue (First In First Out)
 * Stack (Last In First OUt)
 *
 *  the application:
 *  pushes characters to stack and enqueue in queue
 *  pops in the revers order and dequeue the queue and compare the each elements
 *  displays the result
 *
 *
 * @author  Anjan
 * @version 6.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic";
        Queue<Character> queue= new LinkedList<>();
        Stack<Character> stack=new Stack();

      //inserting into queue and stack
      for (char c: input.toCharArray()){
          stack.push(c);
          queue.add(c);
      }

      boolean isPalindrome=true;

      while (!queue.isEmpty()){
          if(queue.remove()!=stack.pop()){
              isPalindrome=false;
              break;
          }
      }

      //displaying the result
        System.out.println("input: "+input);
        System.out.println("is Palindrome? :"+isPalindrome);


    }
}