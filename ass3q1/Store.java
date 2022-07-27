package ass3q1;


abstract public class Store {
    public Ecommerce OrderProducts(String type) {
        Ecommerce pz = CreateProduct(type);
        pz.Prepare();
        pz.Mix();
        pz.Delivery();

        return pz;
    }

    public abstract Ecommerce CreateProduct(String type);
}


