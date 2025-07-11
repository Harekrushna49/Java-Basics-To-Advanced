package CollectionFramework.ArrayLists;
import java.util.*;

public class Removing_Element_By_Index {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(7);

        // Removing elements By Index Number
        System.out.print("Removing Elements : ");
        list.remove(0);
        System.out.println(list);
    }
}
