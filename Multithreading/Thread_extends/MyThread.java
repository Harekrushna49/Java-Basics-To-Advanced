package Multithreading.Thread_extends;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try{
            Thread.sleep(2000);  //It will sleep the current thread for 2000 milliseconds
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());  //It will return the state of the thread. Which is NEW

        t1.start();
        System.out.println(t1.getState());  //It will return the state of the thread. Which is RUNNABLE
        Thread.sleep(1000);  //It will sleep the current thread for 1000 milliseconds
        System.out.println(t1.getState());  //It will return the state of the thread. Which is TERMINATED
        t1.join();  //It will wait for the thread to complete
        System.out.println(t1.getState());
    }
}
