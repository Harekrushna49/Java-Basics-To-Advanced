import java.util.*;
public class Practice_1 {
    public static void main(String args[]){

        // 1. Percentage Calaulator
        System.out.println("Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks Scored in English =");
        float en = sc.nextFloat();
        System.out.println("Marks Scored in Odia = ");
        float od = sc.nextFloat();
        System.out.println("Marks Scored in Physics = ");
        float ph = sc.nextFloat();
        System.out.println("Marks Scored in Chemistry = ");
        float ch = sc.nextFloat();
        System.out.println("Marks Scored in Mathematics = ");
        float ma = sc.nextFloat();
        System.out.println("Marks Scored in Information Technology = ");
        float it = sc.nextFloat();
        float tot = en+od+ph+ch+ma+it;
        float per = (tot*100/600);
        System.out.println("Your Total Mark is = "+tot);
        System.out.println("Your Percentage is = "+per);

        // 2. Add 3 Numbers.
        int a = 4;
        int b = 6;
        int c = 7;
        int Add = a+b+c;
        System.out.println(Add);

        // 3. CGPA Calculator
        float a1 = 74;
        float a2 = 60;
        float a3 = 80;
        float cgpa = (a1+a2+a3)/30;
        System.out.println("Your CGPA is "+cgpa);

        // 4. Convert Kilometers to Miles

        System.out.println("Kilometer to Miles Converter");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Kilometer = ");
        double kil = s.nextDouble();
        double mil = (a*0.62137119);
        System.out.println("Your Miles is = "+mil);
    }
}
