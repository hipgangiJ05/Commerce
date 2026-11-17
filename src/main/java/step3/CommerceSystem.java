package step3;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner sc = new Scanner(System.in);
    List<Category> category;
    Product product;

    CommerceSystem (List<Category> category) {
        this.category = category;
    }

    void start () {
        for (int a = 0; a < category.size(); a++) {
            Category ctgy = category.get(a);
            System.out.println("[" + (a + 1) + "] " + ctgy.categoryName);
            for (int b = 0; b < ctgy.products.size(); b++) {
                Product product = ctgy.getProducts().get(b);
                System.out.println("    "+(b+1)+". "+product.getProductName());
            }
        }
    }
}

