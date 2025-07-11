package CollectionFramework.ArrayLists;
import java.util.List;
import java.util.ArrayList;

public class Convert_to_Array {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<> ();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);
        num.add(11);
        num.add(12);

        Object[] arr = num.toArray();
        Integer[] arr1 = num.toArray(new Integer[0]);
    }
}
