import java.util.Scanner;
public class Test5 {
    public static void main (String [] args)
    {

        /*

         *
        ***
       *****
      *******
     *********

     */

        int rows = 5; // Number of rows for the pyramid
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = rows; j >= i; j--) 
            {
                System.out.print(" "); // Print spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }

/*

    *
   * *
  * * *
 * * * *
* * * * *

*/


        int rows1 = 5; // Number of rows for the pyramid
        for (int i = 1; i <= rows1; i++) 
        {
            for (int j = rows1; j > i; j--) 
            {
                System.out.print(" "); // Print spaces
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("* "); // Print stars with a space
            }
            System.out.println(); // Move to the next line
        }
        
        int row2,column2;
        for(row2=1; row2<=3; row2++)
        {
            for(column2=1; column2<=5; column2++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row3=1; row3<=4; row3++)
        {
            for(int column3=1; column3<=4;column3++)
            {
                System.out.print(column3+ " ");
            }
            System.out.println();
        }

        for(int row4=1; row4<=4; row4++)
        {
            for(int column4=1; column4<=row4; column4++)
            {
                System.out.print(row4+" ");
            }
            System.out.println();   
        }

        for(int row5=1; row5<=4; row5++)
        {
            for(int column5=4; column5>=row5; column5--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
