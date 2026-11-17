package step3;

import java.util.List;

public class Category {
    String categoryName;
    List<Product> products;

    Category(String categoryName, List<Product> products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    String getCategoryName() {
        return categoryName;
    }
    List<Product> getProducts () {
        return products;
    }

}
