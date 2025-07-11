package CollectionFramework.ArrayLists;
import java.util.ArrayList;

public class Checking_Element_Existance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(7);

        //Checking elements existance
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
    }
}
