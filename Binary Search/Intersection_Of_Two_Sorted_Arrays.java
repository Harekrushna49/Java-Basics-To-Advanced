//package Binary Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intersection_Of_Two_Sorted_Arrays {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr2.get(j) < arr1.get(i)) {
                j++;
            } else { // If both elements are equal
                ans.add(arr1.get(i));
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Enter " + n + " sorted elements for the first array:");
        for (int i = 0; i < n; i++) {
            arr1.add(sc.nextInt());
        }

        System.out.print("Enter the size of the second array: ");
        int m = sc.nextInt();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter " + m + " sorted elements for the second array:");
        for (int i = 0; i < m; i++) {
            arr2.add(sc.nextInt());
        }

        ArrayList<Integer> intersection = findArrayIntersection(arr1, n, arr2, m);

        System.out.println("Intersection of the two arrays: " + intersection);

        sc.close();
    }
}
