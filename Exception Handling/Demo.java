

class AakashException extends Exception{
    public AakashException(String s){
        super(s);
    }
}

public class Demo{
    public static void main(String[] args)throws AakashException {
        
        int i = 20;
        int j = 0;

        try{
            j = 18/i;

            if(j == 0){
                throw new AakashException("I don't want to print zero"); 
            }
        }
        catch(AakashException e){
            j = 18/1;
            System.out.println("This is the default value of j : " + j);
            System.out.println(e);
        }

        System.out.println(j);
    }
}