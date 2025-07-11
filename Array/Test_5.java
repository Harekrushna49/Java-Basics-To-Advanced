// package Array;

public class Test_5 {
    static int logic(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == key) {
                return mid;
            }
            
            // Ascending order binary search:
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // Make sure this array is sorted if using binary search for ascending order.
        int ar[] = {1, 5, 6, 8, 9};
        int c = logic(ar, ar.length, 5);
        System.out.println("Index of key is: " + c);
    }
}
