// package Array;
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Element of Array = ");
        arr[0] = sc.nextInt();
        System.out.printf("1st element is %d%n", arr[0]); // Use printf for formatted output
    }
}
