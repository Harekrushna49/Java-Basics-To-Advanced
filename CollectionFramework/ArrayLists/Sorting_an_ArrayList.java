package CollectionFramework.ArrayLists;
import java.util.*;

public class Sorting_an_ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> arrange = new ArrayList<> ();
        arrange.add(2);
        arrange.add(9);
        arrange.add(6);
        arrange.add(5);
        arrange.add(10);
        arrange.add(4);
        arrange.add(1);

        System.out.println(arrange);

        //Sorting an ArrayList
        Collections.sort(arrange);
        System.out.println("After Sorting the ArrayList : "+arrange);
    }
}
