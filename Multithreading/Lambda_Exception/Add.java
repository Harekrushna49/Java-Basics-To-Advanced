package Multithreading.Lambda_Exception;

public class Add {
    public void print(){
        System.out.println("I am from print method.");
    }

    Runnable run = ()-> {System.out.println("I am from Lambda Expression.");};
}
