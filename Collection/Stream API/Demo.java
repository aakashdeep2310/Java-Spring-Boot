import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 3, 9, 6, 7, 8);

        // int sum = 0;

        // for(int n : nums){
        // if(n%2==0){
        // n = n*2;
        // sum += n;
        // }
        // }
        // System.out.println(sum);

        // nums.forEach(n->
        // {
        // System.out.println(n);
        // }
        // );

        // for each loop

        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n){
        // System.out.println(n);
        // }
        // };
        // or use lambda expression to reduce the code
        // Consumer<Integer> con = (n) -> {
        // System.out.println(n);
        // };
        // nums.forEach(con);
        // reduce the code more --->

        // nums.forEach(n -> System.out.println(n));

        // Now Learn Stream API

        // Stream<Integer> s = nums.stream();
        // Stream <Integer> s2 = s.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n-> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        // Now make it shorter to wirte in one line
        // int result = nums.stream()
        // .filter(n -> n%2 == 0)
        // .map(n-> n*2)
        // .reduce(0, (c,e) -> c+e);

        // System.out.println(result);
        // s3.forEach(n -> System.out.println(n));

        List<Integer> nums2 = Arrays.asList(4, 5, 3, 9, 6, 7, 8);
        // Predicate<Integer> p = n ->  n % 2 == 0;

       
        // Function<Integer, Integer> fun = new Function<Integer, Integer>() {
        //     public Integer apply(Integer n) {
        //         return n * 2;
        //     }
        // };
        // OR use lambda expression to reduce the code  
        // Function<Integer, Integer> fun =  n ->   n*2;
            
      

        // int result = nums2.stream()
        // .filter(n->n%2==0)
        // .map(n -> n*2)
        // .reduce(0, (c, e) -> c + e);
        
        // System.out.println(result);

        // Stream<Integer> sortedValues = nums2.stream()
                        // .filter(n -> n % 2 == 0)
                        // .sorted();

        // System.out.println(sortedValues);
        // sortedValues.forEach(n -> System.out.println(n));
        
        Stream<Integer> sortedValues = nums2.parallelStream()
        .filter(n -> n % 2 == 0)
        .sorted();
        
        sortedValues.forEach(n -> System.out.println(n));

    }

}
