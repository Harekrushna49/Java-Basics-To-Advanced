package Exception_Handling;
import java.util.*;

public class try_catch_finally {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public void add(int num) {
        list.add(num);
        try {
            System.out.println(list.get(0));
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("I will always execute");
        }
    }
}
