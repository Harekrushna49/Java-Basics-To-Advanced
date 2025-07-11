// package Array;

import java.util.*;
public class Unique_number_in_an_array {
    public static int findUnique(int []arr)
    {
        int ans=0;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner pw = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = pw.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.printf("Enter the %d position of the array = ",i+1);
            arr[i] = pw.nextInt();
        }
        System.out.print("Your Array is = ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr [i]+ " ");
        }
        System.out.println();

        int Single = findUnique(arr);
        System.out.print("The unique number in this array is = "+Single);
    }
}
