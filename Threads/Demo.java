
class A extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("hello Peter");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("hello Tony");
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class Demo {

    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        obj.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);

        obj.start();
        try{
            Thread.sleep(103);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        obj2.start();
    }
}