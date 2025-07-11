package CollectionFramework.Comparator;
import java.util.Comparator;
import java.util.ArrayList;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add(1);
        list.add(15);
        list.add(5);
        list.add(3);

        list.sort(new MyComparator());
        System.out.println(list);
    }
}
