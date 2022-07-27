package ass3q1;
public class Products extends Store {
    public int sum=0;
    @Override
    public Ecommerce CreateProduct(String type) {
        if(type.equals("Men T Shirt")) {
            MenTshit cp = new MenTshit();
            return cp;

        }
        else if(type.equals("Women T Shirt")) {
            WomenTshirt bp = new WomenTshirt();
            return bp;
        }
        else if(type.equals("Men Pant")) {
            MenPant ap = new MenPant();
            return ap;
        }
        else if(type.equals("Women Pant")) {
            WomenPant dp = new WomenPant();
            return dp;
        }
        return null;
    }
}
