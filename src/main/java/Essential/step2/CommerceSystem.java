package Essential.step2;


import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    List<Product> products;
    Scanner sc = new Scanner(System.in);

    CommerceSystem (List<Product> products) {
        this.products = products;
    }

    void start() {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.printf((i + 1) + ". %-15s | %,10d원 | %-10s %n", product.getProductName(), product.getPrice(), product.getDescription());
        }
        System.out.printf(0 + ". %-15s | %-10s %n", "exit", "프로그램 종료");
        int e = sc.nextInt();
        if (e == 0) {
            System.exit(0);
        } else {
            System.out.println("잘못된 입력입니다");
        }
    }
}