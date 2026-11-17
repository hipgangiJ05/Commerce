package step3;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner sc = new Scanner(System.in);
    Category category;

    CommerceSystem (Category category) {
        this.category = category;
    }

    void start () {
        for (int i=0; i < category.products.size(); i++) {
            Product product = category.products.get(i);
            System.out.printf((i+1) + ". %-15s | %,10d원 | %-15s %n", product.productName, product.price, product.description, product.stockQuantity);
        }
        System.out.printf(0 + ". %-15s | %-15s %n", "exit", "프로그램 종료");
        int e = sc.nextInt();
        if (e == 0) {
            System.exit(0);
        }
    }
}
