/**
 * main class - use case palindrome app
 *
 * use case 2: Reverse String based Palindrome check
 * description
 * this class demonstrate reverse string based palindrome check
 *
 * the application:
 * iterates the string in reverse order
 * build a reverse version
 * checks with the original string
 * display the validation result
 *
 *
 * @author  Anjan
 * @version 3.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){
     String orginalString="anjna";
     String reversedString="";
     for(int i=orginalString.length()-1;i>=0;i--){
         reversedString += orginalString.charAt(i);
     }
        if (orginalString.equals(reversedString)) {
            System.out.println(orginalString+ " is palindrome ");
        }
        else
            System.out.println(orginalString+ " is not palindrome");
        }
}