package ass3q1;

public class WomenTshirt extends Ecommerce {
    public WomenTshirt() {
        name = "Women T Shirt";
        price = 15;
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



