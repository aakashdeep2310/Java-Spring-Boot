import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compatator {

    public static void main(String[] args) {

        // Comparator<Integer> com = new Comparator<Integer>()
        // {
        //     public int compare(Integer i, Integer j){
        //         if(i%10 > j %10){
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
        // };


        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(10);
        // nums.add(12);
        // nums.add(65);
        // nums.add(34);
        // nums.add(86);

        // Collections.sort(nums, com);

        // System.out.println(nums);

        //Task

        List<String> names = new ArrayList<String>();
        names.add("Rahul");
        names.add("Aman");
        names.add("Sam");
        names.add("Abhi");

        Comparator<String> comp = new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        };

        Collections.sort(names, comp);
        System.out.println(names);
    }
}