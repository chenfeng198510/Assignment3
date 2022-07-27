package ass3q1;

public class MenTshit extends Ecommerce {
    public MenTshit() {
        this.name = "Men T Shirt";
        this.price = 15;
    }
    @Override
    public int getSum(){sum=getPrice()+sum;
        return sum;}
    public void Mix() {

        System.out.println("Waiting... The price of product " + getName() + " is " + getPrice() + " dollars");
    }
    @Override
    public void Delivery() {

        System.out.println("Product Added to Shopping Cart");
    }


}


