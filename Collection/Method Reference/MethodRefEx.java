import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aakash", "Aman", "Abhi", "Rudra", "Aadi");
        List<String> uNames = names.stream()
                    // .map(n->n.toUpperCase()). OR
                    .map(String::toUpperCase). // this is called method reference
                    toList();

        // System.out.println(uNames);

        uNames.forEach(i -> System.out.println(i)); // here we can also use the method reference
        uNames.forEach(System.out::println);
    }
    
}
