package Loops;

import java.util.*;
public class Practice_1 {
    public static void main(String[] args) {

        /* 1. Print like this pattern :
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for (int i = 5; i>0; i--){
            for (int j = 0; j<i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        // 2. Sum first 'n' even numbers.
        int sum = 0;
        int n = 4;
        for (int i = 0; i < n; i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of even number is "+sum);

        // 3. Multiplication Table
        Scanner Mul = new Scanner(System.in);
        System.out.println("Enter a number for Multiplication Table = ");
        int z = Mul.nextInt();
        for (int y = 1; y <= 10; y++){
            System.out.printf("%d * %d = %d\n",z,y,z*y);
        }

        // 4. Multiplication Table in reverse Order
        System.out.println("Multiplication Table in reverse Order");
        System.out.println("Enter a Number for Reverse Mutiplication table = ");
        int t = Mul.nextInt();
        for (int c = 10; c >= 1; c--){
            System.out.printf("%d * %d = %d\n",t,c,t*c);
        }

        // 5. Factorial of a number.
        System.out.println("Factorial of a number.");
        System.out.println("Enter a number = ");
        int fac = Mul.nextInt();
        long factorial = 1;
        for (int v = 1; v <= fac; v++){
            factorial = factorial * v;
        }
        System.out.printf("Factorial of %d is %d.\n",fac,factorial);

        // 6. 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Row and Column = ");
        int o = sc.nextInt();
        
        int i=1;
        while(i<=o)
        {
            int j=1;
            while(j<=o)
            {
                System.out.print(n-j+1 +" " );
                j++;
            }
        System.out.println();
        i++;
        }

        // 7. 
        
    }
}
