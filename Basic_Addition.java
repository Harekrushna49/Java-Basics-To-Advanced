import java.util.Scanner;

public class Basic_Addition {
    public static void main (String [] args){

        // 1. Integer
        System.out.println("For Integer Value");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int a = s.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = s.nextInt();
        int c = a+b;
        System.out.println("Your addition is = " +c);

        // 2. Float
        System.out.println("For Float Value");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        float a1 = s1.nextFloat();
        System.out.println("Enter Number 2 : ");
        float b1 = s1.nextFloat();
        float c1 = a1+b1;
        System.out.println("Your addition is = " +c1);

        // 3. Long
        System.out.println("For Long Value");
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        Long a2 = s2.nextLong();
        System.out.println("Enter Number 2 : ");
        Long b2 = s2.nextLong();
        Long c2 = a2+b2;
        System.out.println("Your addition is = " +c2);

        // 4. Double
        System.out.println("For Double Value");
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        Double a3 = s3.nextDouble();
        System.out.println("Enter Number 2 : ");
        Double b3 = s3.nextDouble();
        Double c3 = a3+b3;
        System.out.println("Your addition is = " +c3);


        // Checking the Entered value was Integer or not.
        System.out.println("Checking for Integer or not");
        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        boolean b4 = s4.hasNextInt();
        System.out.println("Your Entered Number was "+b4);

        // Checking the Entered value was Float or not.
        System.out.println("Checking for Float or not");
        Scanner s5 = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        boolean b5 = s5.hasNextFloat();
        System.out.println("Your Entered Number was "+b5);

        // Checking the Entered value was Long or not.
        System.out.println("Checking for Long or not");
        Scanner s6 = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        boolean b6 = s6.hasNextInt();
        System.out.println("Your Entered Number was "+b6);

        // Checking the Entered value was Double or not.
        System.out.println("Checking for Double or not");
        Scanner s7 = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        boolean b7 = s7.hasNextInt();
        System.out.println("Your Entered Number was "+b7);

        // Printing the String.
        System.out.println("Printing the String");
        Scanner s8 = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = s8.next();
        System.out.println("Your Entered Number was "+str);

        // Printing the Whole Sentence.
        System.out.println("Printing the Sentence.");
        Scanner s9 = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str1 = s9.next();
        System.out.println("Your Entered Number was "+str1);
    }
}
