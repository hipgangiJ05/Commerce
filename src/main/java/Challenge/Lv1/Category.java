package Challenge.Lv1;

import java.util.List;

public class Category {
    private String categryName;
    private List<Product> products;

    public Category (String categryName, List<Product> products) {
        this.categryName = categryName;
        this.products = products;
    }

    public String getCategryName () {
        return this.categryName;
    }
    public List<Product> getProducts () {
        return this.products;
    }
}
