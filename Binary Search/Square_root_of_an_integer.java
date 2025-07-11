public class Square_root_of_an_integer {
    public static int sqrt(int n) {
        if (n == 0 || n == 1) return n; // Base case
    
        int start = 1, end = n, ans = 0;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (mid * mid == n) return mid; // Perfect square
    
            if (mid * mid < n) {
                ans = mid; // Store the floor value
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans; // Floor value of square root
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Square root of " + n + " is: " + sqrt(n)); // Output: 3
    }
}