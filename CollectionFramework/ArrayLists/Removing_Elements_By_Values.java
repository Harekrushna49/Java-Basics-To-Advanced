package CollectionFramework.ArrayLists;
import java.util.ArrayList;
import java.util.List;

public class Removing_Elements_By_Values {
    public static void main(String[] args) {
        List<String> days = new ArrayList<> ();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Hello");
        System.out.println();
        System.out.println(days);

        // Removing elements by values
        days.remove("Hello");
        System.out.println();
        System.out.println(days);
    }
}
