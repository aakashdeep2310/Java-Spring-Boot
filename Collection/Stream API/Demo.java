import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
         List<Integer> nums = Arrays.asList(4,5,3,9,6,7,8);
        
        //  int sum = 0;

        //  for(int n : nums){
        //     if(n%2==0){
        //         n = n*2;
        //         sum += n;
        //     }
        // }
        // System.out.println(sum);

        // nums.forEach(n->
        // {
        //     System.out.println(n);
        // }
        // );

        //for each loop

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };
        // or use lambda expression to reduce the code
        // Consumer<Integer> con = (n) -> {
        //     System.out.println(n);
        // };
        // nums.forEach(con);
        // reduce the code more --->

        // nums.forEach(n -> System.out.println(n));


        // Now Learn Stream API

        Stream<Integer> s = nums.stream();
        Stream <Integer> s2 = s.filter(n -> n%2 == 0);
        Stream<Integer> s3 = s2.map(n-> n*2);

        s3.forEach(n -> System.out.println(n));
         
    }

    
}
