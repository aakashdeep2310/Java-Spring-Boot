import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {
       List<String> names = Arrays.asList("Aakash", "Aman", "Aaditya", "Amit", "Ankit", "Ankur", "Anshul", "Anshuman", "Anmol", "Anurag", "Anuj", "Anupam", "Anurag", "Anshuman", "Anshul");
    
       Optional<String> name = names.stream()
                    .filter(str -> str.contains("d"))
                    .findFirst();
                  
        // System.out.println(name.get());
        System.out.println(name.orElse("Not founde"));

    }

    
}
