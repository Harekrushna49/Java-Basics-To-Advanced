//package Array;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size row = ");
        int n = sc.nextInt();
        System.out.print("Enter the size of Column = ");
        int m = sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.printf("Enter the %d %d element of array = ",i+1, j+1);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing the Array = ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
