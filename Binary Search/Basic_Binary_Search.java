import java.util.Scanner;

public class Basic_Binary_Search {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid; // Target found, return index
            } else if (nums[mid] < target) {
                s = mid + 1; // Search right half
            } else {
                e = mid - 1; // Search left half
            }
        }
        return s; // Return the position where the target should be inserted
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt(); // Taking array size from user
        int nums[] = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        Basic_Binary_Search obj = new Basic_Binary_Search();
        System.out.println("Target position: " + obj.searchInsert(nums, target));

        sc.close(); // Closing scanner
    }
}
