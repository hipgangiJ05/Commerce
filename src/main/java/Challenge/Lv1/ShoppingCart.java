package Challenge.Lv1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> storeProduct;

    public ShoppingCart () {
        this.storeProduct = new ArrayList<>();
    }

    public List<Product> getStoreProduct () {
        return this.storeProduct;
    }

    public void setStoreProduct(List<Product> storeProduct) {
        this.storeProduct = storeProduct;
    }
    public void addStoreProduct(Product product) {
        this.storeProduct.add(product);
    }
}
