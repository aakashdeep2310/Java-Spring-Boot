import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    

    

}

public class ConstructorRefEx {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aakash", "Aman", "Abhi", "Rudra", "Aadi");
        List<Student> students = new ArrayList<>();

        // for(String name : names){
        //     students.add(new Student(20, name));
        // }

        // students = names.stream()
        //             .map(name -> new Student(20, name))
        //             .toList();
        
        // OR we can use Constructor reference
        students = names.stream()
                    .map(Student::new)
                    .toList();

        System.out.println(students);



    }

}
