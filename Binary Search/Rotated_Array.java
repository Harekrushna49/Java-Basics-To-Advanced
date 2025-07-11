public class Rotated_Array {
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            // Left half is sorted
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid])
                    end = mid - 1;  // Search in left half
                else
                    start = mid + 1; // Search in right half
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[end])
                    start = mid + 1;  // Search in right half
                else
                    end = mid - 1; // Search in left half
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println("Index of " + target + " is: " + search(arr, target));  // Output: 2
    }
}
