import java.util.*;

class Rev {

    public static int Reverse(int x) {
        int count = 0;
        while (x != 0) {
            // Handle overflow/underflow
            if (count > Integer.MAX_VALUE / 10 || count < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int mod = x % 10;
            count = (count * 10) + mod;
            x = x / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to Reverse: ");
        int x = sc.nextInt();

        int reversed = Reverse(x);
        System.out.println("Reversed Number = " + reversed);

        sc.close();
    }
}
