package Challenge.Lv1;

public class Product {
    private String productName;
    private int price;
    private String description;
    private int stockQuantity;
    private int quantity = 0;

    public Product (String productName, int price, String description, int stockQuantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    public String getProductName () {return this.productName;}
    public int getPrice () {return this.price;}
    public String getDescription () {return this.description;}
    public int getStockQuantity () {return this.stockQuantity;}
    public int getQuantity () {return this.quantity;}

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
