package Multithreading.Interrupted;

public class Interup extends Thread{
    @Override
    public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("Thread is Running");
            } catch (InterruptedException e) {
                System.out.println("Thread is Interrupted : "+e);
            }
    }

    public static void main(String[] args) {
        Interup obj = new Interup();
        obj.start();
        obj.interrupt();
    }
}
