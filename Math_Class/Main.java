package Math_Class;

public class Main {
    public static void main(String[] args) {
        int a = 144;
        int b = 15;

        // Maximum number between two numbers
        int max = Math.max(a, b);

        // Minimum number between two numbers
        int min = Math.min(a, b);


        int c = -1;
        int abs = Math.abs(c);
        System.out.println(abs);

        double d = 1.52;
        double ceil = Math.ceil(d);
        System.out.println(ceil);
        System.out.println(Math.floor(d));

        // Round figure of a number
        System.out.println(Math.round(d));

        // Square Root of a number
        System.out.println(Math.sqrt(a));

        //Power of a number
        //System.out.println(Math.pow(b));
        System.out.println(Math.pow(12,2));

        // Lograthim of any number
        System.out.println(Math.log(10));

        // Trigonometry
        System.out.println(Math.sin(45));

        // Adding number in PI value
        System.out.println(1+Math.PI);

        //Generating Random Number automatically
        System.out.println(Math.random());
    }
}
