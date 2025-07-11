package CollectionFramework.LinkedList;
import java.util.LinkedList;

public class LList {
    public static void main(String...args)
    {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(18);
        list1.add(7);
        list1.add(22);
        list1.addFirst(4); // add element at first
        list1.addLast(25); // add element at last
        System.out.println(list1.getFirst()); // get first element
        System.out.println(list1.getLast()); // get last element
        System.out.println(list1);
    }
}
