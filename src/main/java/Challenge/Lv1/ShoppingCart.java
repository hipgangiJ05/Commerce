package Challenge.Lv1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> storeProduct;
    private int totalAmount;

    public ShoppingCart () {
        this.storeProduct = new ArrayList<>();
    }

    public List<Product> getStoreProduct () {
        return this.storeProduct;
    }

    public void addStoreProduct(Product product) {
        this.storeProduct.add(product);
    }
    public int totalAmount() {
        totalAmount = 0;
        for (Product product : this.getStoreProduct()) {
            totalAmount += (product.getPrice() * product.getQuantity());
        }
        return this.totalAmount;
    }
    public void productElimination () {
        for (Product product : this.storeProduct) {
            product.setQuantity(0);
        }
        this.totalAmount = 0;
        this. storeProduct.clear();

    }
}
