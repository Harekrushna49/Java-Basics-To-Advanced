package CollectionFramework.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map =new HashMap<>();

        // Adding elements
        map.put(1, "Sahil Kumar");
        map.put(2, "Prabhudeva Nayak");
        map.put(3, "Jagdish Jena");
        map.put(4, "Nitu Sethi");
        map.put(5, "Sumit Kumar Pattanayak");
        map.put(6, "Swadesh Pattanayak");

        // Accessing elements
        System.out.println(map);

        // Accessing elements
        String s1 = map.get(1);
        String s2 = map.get(22);
        System.out.println(s1);
        System.out.println(map.get(3));
        System.out.println(s2);

        // It will return boolean value
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Sumit Kumar Pattanayak"));

        // Accessing elements by using for each loop
        System.out.println("==================Showing all students================");
        for (String s : map.values()) {
            System.out.println(s.toUpperCase());
        }

/*
        // Accessing elements by using Set
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();

        for(Map.Entry<Integer, String> entry : entrySet){
            entry.setValue(entry.getValue().toUpperCase());
        }*/
    }
}
