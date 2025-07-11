package Multithreading.Lambda_Exception;

public class Test {
    public static void main(String[] args) {
        Add a = new Add();
        a.print();
        Thread t = new Thread(a.run);
        t.start();
    }
}
