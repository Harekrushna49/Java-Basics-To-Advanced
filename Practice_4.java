public class Practice_4 {
    // 1. Multiplication Table
    static int Multi(int a){
        System.out.println("Multiplication Table");
        System.out.println();
        for (int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d\n",a,i,a*i);
        }
        return 0;
    }

    // 2. Star Pattern
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    static void star(int n){
        System.out.println();
        System.out.println("Star Pattern");
        for (int i=0; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Fibonacci Series
    static int fibo(int z){
        if (z == 1) {
            return 0;
        }
        else if (z==2){
            return 1;
        }
        else {
            return  fibo(z-1)+ fibo(z-2);
        }
    }
    public static void main(String[] args) {
        // For Multiplication Table
        int c;
        c=Multi(2);

        // For Star Pattern
        star(5);

        // For Fibonaaci Series
        int result;
        result=fibo(5);
        System.out.println("Fibonacci Series "+result);
    }
}
