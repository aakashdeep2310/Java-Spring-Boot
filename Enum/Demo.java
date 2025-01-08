
enum Laptop{
    Mackbook(2000), Pavilion(1500), TUF, Thinkpad(1000), VivoBook(1200);

    private int price;

    private Laptop(){
        price = 500;

    }

    private Laptop(int price){
        this.price = price;
        System.out.println("And the price is : " + price + this.name());

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

}


public class Demo{



    public static void main(String[] args) {
        // Laptop lap = Laptop.Mackbook;
        // System.out.println(lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }


        
    }
}