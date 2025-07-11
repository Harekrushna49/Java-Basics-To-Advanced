import java.util.*;

public class String_Palindrome {

public static boolean isPalindrome(String s)
{   
        
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean res = isPalindrome(s);

        // Print the result with enhanced output
        if (res) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}