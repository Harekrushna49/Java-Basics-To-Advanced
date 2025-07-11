package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throw_exceptions {
    public static void main(String[] args) throws Exception {
        method();
    }

    public static void method() throws FileNotFoundException
    {
        try {
            FileReader file = new FileReader("abc.png");
        }
        catch (Exception e)
        {
            throw new FileNotFoundException("oops something went wrong :( ");
        }
    }
}
