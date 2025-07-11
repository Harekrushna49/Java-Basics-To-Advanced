package Multithreading.Thread_extends;

public class NewThread1 extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

}

class Main{
    public static void main(String[] args) throws Exception {
        NewThread1 obj = new NewThread1();
        obj.start();
        obj.join();
        System.out.println("Hello");
    }
}