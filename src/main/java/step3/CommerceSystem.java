package step3;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner sc = new Scanner(System.in);
    List<Product> products;

    CommerceSystem (List<Product> products) {
        this.products = products;
    }

    void start () {
        for (int i=0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.printf((i+1) + ". %-15s | %,10d | %-15s %n", product.productName, product.price, product.description, product.stockQuantity);
        }
        System.out.printf(0 + "%-15s | %-15s", "exit", "프로그램 종료");
        int e = sc.nextInt();
        if (e == 0) {
            System.exit(0);
        }
    }
}
