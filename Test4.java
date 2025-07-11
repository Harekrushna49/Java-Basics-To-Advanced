import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Prime Number");

        System.out.print("Enter a value of 'i' = ");
        int i = sc.nextInt();

        System.out.print("Enter another value of 'N' = \n");
        int n = sc.nextInt();

        for (int j = i; j <= n; j++) {
            int count = 0;
            for (int k = 1; k <= j; k++) {
                if (j % k == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(j);
            }
        }
    }
}
