public class Loops {
    public static void main(String[] args) {

        // 1. while loop
        System.out.println("while loop");
        int a = 1;
        while (a<=3){
            System.out.println(a);
            a++;
        }

        // 2. do-while loop
        System.out.println("do-while loop");
        int b = 0;
        do {
            System.out.println(b);
            b++;
        }while (b<5);

        // 3. for loop
        System.out.println("for loop");
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
    }
}
