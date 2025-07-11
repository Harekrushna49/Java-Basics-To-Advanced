package CollectionFramework.ArrayLists;
import java.util.ArrayList;

public class Accessing_Elements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(7);

        // Accessing elements
        System.out.println(list);

        // Accessing elements from index
        System.out.println(list.get(2));

        // Accessing size
        System.out.println(list.size());
        System.out.println();

        System.out.print("Using for each loop : ");
        for(int i: list)
        {
            System.out.print(i+" ");
        }

        System.out.print("\nUsing for loop : ");
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
