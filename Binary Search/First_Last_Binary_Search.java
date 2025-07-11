//package Binary Search;

import java.util.*;

class Position {
    // Find the first occurrence of the target
    public int Position1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return first;
    }

    // Find the last occurrence of the target
    public int Position2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int second = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                second = mid;
                start = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return second;
    }

    // Function to return the first and last occurrence of the target
    public int[] findfirstandlastoccurance(int[] arr, int target) {
        int first = Position1(arr, target);
        int last = Position2(arr, target);

        return new int[]{first, last};
    }
}

public class First_Last_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the sorted array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element = ");
        int target = sc.nextInt();

        Position find = new Position(); // Create an object of the Position class
        int[] result = find.findfirstandlastoccurance(arr, target);

        System.out.println("First Occurrence = " + result[0]);
        System.out.println("Last Occurrence = " + result[1]);
    }
}



/*
 * import java.util.*;

package Array;

class Position{
    public int Position1(int []arr, int target){
        int start=0;
        int end=arr.length-1;
        int first = -1;

        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                first=mid;
                end=mid-1;
            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return first;   
    }

    public int Position2(int []arr, int target){
        int start=0;
        int end=arr.length-1;
        int second = -1;


        while (start<end) {
            int mid=start+(end-start)/2; // { mid = (start+end)/2 or, mid=start+(end-start)/2 } both are same but in case1: This approach is simple and intuitive but can cause integer overflow in some cases.             
            if (arr[mid]==target) {
                second=mid;
                end=mid-1;
            }
            else if (start<end) {
                start=mid+1;
            }
            else{
                mid=mid-1;
            }
        }
       return second;
    }

    public int[] findfirstandlastoccurancce(int []arr, int target)
    {
        int first=Position1(arr, target);
        int last=Position2(arr, target);

        return new int[]{first,last};
    }
}

public class First_Last_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of sorted array = ");
        int n = sc.nextInt();
        int []arr=new int[n];

        System.out.println("Enter"+n+"sorted elements = ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target elements = ");
        int target=sc.nextInt();

        int []result=findfirstandlastoccurancce(arr,target);

        System.out.println("First Occurance = "+result);
        System.out.println("Enter"+n+"sorted Elements = ");

        Position find = new Position();

    }
    
}

 * 
 */