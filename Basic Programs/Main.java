//package Basic Programs;

public class Main {
    public static void main(String[] args) {
        AdvCal ref = new AdvCal();
        int result1 = ref.Add(10, 20);
        int result2 = ref.Sub(10, 20);
        int result3 = ref.Mul(10, 20);
        int result4 = ref.Div(25, 3);
        int result5 = ref.Div(25, 3);
        
        /*System.out.println("Addition of given number is = "+ref.Add(10,20));
        System.out.println("Subtraction of given number is = "+ref.Sub(10,20));
        System.out.println("Multiplication of given number is = "+ref.Mul(10,20));
        System.out.println("Diivision of given number is = "+ref.Div(10,20));*/
        
        System.out.println("Addition of given number is = "+result1+"\nSubtraction of given number is = "+result2+"\nMultiplication of given number is = "+result3+"\nDivision of given number is = "+result4+"\nModulus of given number is = "+result5);
    }
}