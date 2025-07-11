package CollectionFramework.Comparator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        // It will print in ascending order
        return s1.length() - s2.length();

        // It will print in descending order
//        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Date");
        list.sort(new StringLengthComparator());
        System.out.println(list);
    }
}
