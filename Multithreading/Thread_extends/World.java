package Multithreading.Thread_extends;

public class World extends MyThread {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("World");
        }
    }
}
