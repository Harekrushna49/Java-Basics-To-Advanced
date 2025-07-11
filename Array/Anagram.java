package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
        static boolean isAnagram(String a, String b) {
            // Convert both strings to lower case to make it case-insensitive
            a = a.toLowerCase();
            b = b.toLowerCase();

            // If lengths are not equal, not anagrams
            if (a.length() != b.length()) {
                return false;
            }

            // Convert to character arrays
            char[] arrA = a.toCharArray();
            char[] arrB = b.toCharArray();

            // Sort both arrays
            Arrays.sort(arrA);
            Arrays.sort(arrB);

            // Compare sorted arrays
            return Arrays.equals(arrA, arrB);
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();

            boolean ret = isAnagram(a, b);
            System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        }
}
