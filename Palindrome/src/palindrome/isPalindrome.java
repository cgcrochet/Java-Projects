
package palindrome;


public class isPalindrome {
    
    public static boolean palindromeChecker(String input){
        
        if(input.length() <= 1){
            return true;
        }
        
        else if (Character.toLowerCase(input.charAt(0)) == Character.toLowerCase(input.charAt(input.length() - 1)))
            return palindromeChecker(input.substring(1, input.length() - 1));
        
        else
            return false;
    }
}
