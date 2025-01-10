import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int a = 10;
        Collection <Integer> nums = new ArrayList<Integer>();
        // Collection nums = new ArrayList();
        nums.add(a);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(8);

        // System.out.println(nums);
        
        // for(int n : nums){
        //     System.out.print(n+ " ");
        // }
        // for(Object n : nums){
        //     int num = (int)n;
        //     System.out.print(num *2+ " ");
        // }


        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.print(values.next() + " ");
        }
    }
}