package Essential.step2;

public class Product {
    String productName;
    int price;
    String description;
    int stockQuantity;

    Product(String productName, int price, String description, int stockQuantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    public String getProductName () {
        return this.productName;
    }
    public int getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public int getStockQuantity() {
        return this.stockQuantity;
    }
}
