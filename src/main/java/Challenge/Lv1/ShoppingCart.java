package Challenge.Lv1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> storeProduct;
    private int quantity = 0;
    private int totalAmount = 0;

    public ShoppingCart () {
        this.storeProduct = new ArrayList<>();
    }

    public List<Product> getStoreProduct () {
        return this.storeProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity() {
        quantity++;
    }

    public void addStoreProduct(Product product) {
        this.storeProduct.add(product);
    }
    public int totalAmount() {
        for (Product product : this.getStoreProduct()) {
            totalAmount += product.getPrice();
        }
        return this.totalAmount;
    }
}
