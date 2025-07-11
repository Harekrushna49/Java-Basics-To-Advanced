package CollectionFramework.ComparatorUsingLambdaExpression;
import java.util.Arrays;
import java.util.List;

public class Words {


    public static void main(String[] args) {
        List<String> word = Arrays.asList("Banana", "Apple", "Date");
        word.sort((a, b) -> a.length() - b.length());
        System.out.println(word);
    }
}
