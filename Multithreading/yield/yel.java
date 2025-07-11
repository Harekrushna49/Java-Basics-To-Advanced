package Multithreading.yield;

public class yel extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName() +" is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        yel t1 = new yel();
        yel t2 = new yel();
        t1.start();
        t2.start();
    }
}
