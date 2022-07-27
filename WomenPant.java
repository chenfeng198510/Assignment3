package ass3q1;

public class WomenPant extends Ecommerce {
    public WomenPant() {
        this.name = "Women Pant";
        this.price = 25;
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
