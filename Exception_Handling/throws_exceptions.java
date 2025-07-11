package Exception_Handling;
import java.io.*;

public class throws_exceptions {
    public static void main(String[] args) throws FileNotFoundException
    {
        method1();
    }
    public static void method1() throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        FileReader file = new FileReader("a.txt");
        System.out.println("File Opened");
    }
}
