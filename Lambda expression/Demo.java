

@FunctionalInterface
interface A{
    void show(int val);
}

class B implements A{
    public void show(int val){
        System.out.println("Hello Friday " + val);
    }
}


public class Demo {

    public static void main(String[] args) {
        B obj = (int val) -> System.out.println("Hello Peter " + val);
        obj.show(5);     
    }
}

