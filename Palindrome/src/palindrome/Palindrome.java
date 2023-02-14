
package palindrome;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        
        
        System.out.println(isPalindrome.palindromeChecker(input));
    }
    
}
