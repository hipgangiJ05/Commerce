package step3;

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

    String getProductName () {
        return this.productName;
    }
    int getPrice () {
        return this.price;
    }
    String getDescription () {
        return this.description;
    }
    int getStockQuantity () {
        return this.stockQuantity;
    }
}
