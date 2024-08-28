import java.util.*;

public class Conditional_Statement {
       public static void main(String[] args) {

            // 1. if Statement
            System.out.println("if Statement");
            int age = 21;
            if (age>18){
                System.out.println("You can drive!!!");
            }

            // 2. if else Statement
            System.out.println("if...else Statement");
            int age1 = 17;
            if (age1>=18){
                System.out.println("You can Drive!!!");
            }
            else {
                System.out.println("Sorry, you can't Drive....");
            }

            // 3. Else...if Statement
            System.out.println("else...if Statement");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age = ");
            int age3 = sc.nextInt();
            if (age3>40){
                System.out.println("You are Experienced!!!");
            }
            else if (age>35){
                System.out.println("You are Intermediate!!!");
            }
            else if (age>25){
                System.out.println("You are a Beginner!!!");
            }
            else{
                System.out.println("You are not Experienced...");
            }
            // 3. Logical AND Operator
            System.out.println("Logical AND Operator");
            boolean a = true;
            boolean b = true;
            if(a && b){
                System.out.println("Yes");
            }
            else{
                System.out.println("False");
            }

            // 4. Logical OR Operator
            System.out.println("Logical OR Operator");
            boolean a1 = true;
            boolean b1 = false;
            if(a1 || b1){
                System.out.println("Yes");
            }
            else{
                System.out.println("False");
            }

            // 5. Logical NOT
            System.out.println("Logical NOT");
            boolean a2 = false;
            boolean b2 = true;
            System.out.println("NOT of a2 is = ");
            System.out.println(!a2);
            System.out.println("NOT of b2 is = ");
            System.out.println(!b2);
       }
}