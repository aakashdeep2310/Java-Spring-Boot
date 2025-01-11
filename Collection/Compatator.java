import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {

    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    public int compareTo(Student that) {
        return this.age - that.age;
    }
}

public class Compatator {

    public static void main(String[] args) {

        // Comparator<Integer> com = new Comparator<Integer>()
        // {
        // public int compare(Integer i, Integer j){
        // if(i%10 > j %10){
        // return 1;
        // }else{
        // return -1;
        // }
        // }
        // };

        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(10);
        // nums.add(12);
        // nums.add(65);
        // nums.add(34);
        // nums.add(86);

        // Collections.sort(nums, com);

        // System.out.println(nums);

        // Task -1

        // List<String> names = new ArrayList<String>();
        // names.add("Rahul");
        // names.add("Aman");
        // names.add("Sam");
        // names.add("Abhi");

        // Comparator<String> comp = new Comparator<String>(){
        // public int compare(String s1, String s2){
        // return s1.length() - s2.length();
        // }
        // };

        // Collections.sort(names, comp);
        // System.out.println(names);

        Comparator<Student> comp = (i, j) ->{
                // if (i.age> j.age) {
                //     return 1;
                // } else {
                //     return -1;
                // }

                // return i.age - j.age;
                return (i.age > j.age) ? 1 : -1;
            };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Rahul"));
        studs.add(new Student(74, "Aman"));
        studs.add(new Student(56, "Abhi"));
        studs.add(new Student(45, "Rajat"));

        // Collections.sort(studs, comp);
        Collections.sort(studs);  // this works when we implement Comparable interface in Student class

        for (Student s : studs) {
            System.out.println(s);
        }

    }
}