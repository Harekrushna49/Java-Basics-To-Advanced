//package Binary Search;

public class Pivot_Element {
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        
        while (start < end) {

            // If mid element is greater than end, pivot is in the right half
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid; // Pivot is in the left half
            }
            mid = start + (end - start) / 2;
        }
        return start; // or return arr[end], both are same at this point
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};  // Rotated sorted array
        System.out.println("Pivot element is: " + findPivot(arr));
    }
}

