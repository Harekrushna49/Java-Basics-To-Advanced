package Multithreading.Thread_extends;

public class Test {
    public static void main(String... args) {
        World world = new World(); //New
        world.start(); //Runnable
//        for (; ; ) {
//            System.out.println("Hello");
//        }

        for ( ; ; ) {
            System.out.println("Hello");
            System.out.println(MyThread.currentThread().getName());
        }
    }
}
