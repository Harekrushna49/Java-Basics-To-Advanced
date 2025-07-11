public class Recursion {
    static int factorial(int a){
        if (a==0 || a==1){
            return 1;
        }
        else {
            return a*factorial(a-1);
        }
    }
    public static void main(String[] args) {
        int c = 4;
        System.out.println("The value of factorial a is = "+factorial(c));
    }
}
