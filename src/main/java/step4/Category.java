package step4;

import java.util.List;

public class Category {
    private String categoryName;
    private List<Product> product;

    public Category(String categoryName, List<Product> product) {
        this.categoryName = categoryName;
        this.product = product;
    }

    public String getCategoryName () {
        return this.categoryName;
    }
    public List<Product> getProduct () {
        return this.product;
    }

}
