
class A extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("hello Peter");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("hello Tony");
        }
    }
}


public class Demo {

    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        obj.start();
        obj2.start();
    }
}