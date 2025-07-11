package CollectionFramework.ArrayLists;
import java.util.ArrayList;

public class Add_Elements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(7);

        System.out.println(list);

        // Adding elements
        list.add(3, 11);
        System.out.println("Adding Elements : "+list);

        // Adding elements
        System.out.print("Adding Elements : ");
        list.add(2, 3);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
