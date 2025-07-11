package Practice;
import java.util.*;

public class Test_1 {
    public static void main(String[] args) {

    //1.
        int a =754;
        int b = 0;
        try{
            int c = a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Haa");
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        }
//2.
        Scanner sc = new Scanner(System.in);
        int index;
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 54;
        arr[2] = 5;
        arr[3] = 35;
        arr[4] = 65;
        boolean err = true;
        int i = 0;
        while(err && i < 3)
        {
            try {
                index = sc.nextInt();
                System.out.println("The array is : " + arr[index]);
                i++;
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }
    }
}
