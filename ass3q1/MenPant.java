package ass3q1;

public class MenPant extends Ecommerce {
    public MenPant() {
        this.name = "Men Pant";
        this.price = 10;
    }
    @Override
    public int getSum(){sum=getPrice()+sum;
        return sum;}
    @Override
    public void Mix() {

        System.out.println("Waiting... The price of product " + getName() + " is " + getPrice() + " dollars");
    }
    @Override
    public void Delivery() {

        System.out.println("Product Added to Shopping Cart");
    }


}
