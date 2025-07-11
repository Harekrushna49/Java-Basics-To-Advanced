//package Array;

import java.util.*;
public class Swapping_an_array {

public static void SwapArray(int[] arr)
{
    int n = arr.length;
    for(int i =0; i<n;i=i+2)
    {
        if(i+1<n)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}

public static void PrintArray(int[] arr)
{
    int n = arr.length;
    for(int i=0; i<n; i++)
    {
        System.err.print(arr[i]+" ");
    }
    System.err.println();
}

    public static void main(String[] args) {
        
        Scanner sw = new Scanner(System.in);
        
        System.err.print("Enter the size of the Array = ");
        int n = sw.nextInt();
        int arr [] = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.printf("Enter the %d position of array = ",i+1);
            arr[i] = sw.nextInt();
        }
        System.out.println("Before Swapping the array ");
        PrintArray(arr);

        System.out.println("After swapping the Array.");
        SwapArray(arr);
        PrintArray(arr);
    }
}

