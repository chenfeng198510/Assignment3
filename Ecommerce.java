package ass3q1;

abstract public class Ecommerce {
    public String name;
    public int price;
    public int sum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public void Prepare() {
        System.out.println("Preparing...");
    }
    public int getSum(){sum=getPrice()+sum;
    return sum;}

    public void Mix() {

        System.out.println("Waiting... The price of product " + getName() + " is " + getPrice() + " dollars");
    }
    public abstract void Delivery();

}


