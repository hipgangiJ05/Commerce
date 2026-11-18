package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner sc = new Scanner(System.in);
    List<Category> category;
    Product product;

    CommerceSystem(List<Category> category) {
        this.category = category;
    }

    void start() {
        while (true) {
            System.out.println("[실시간 커머스 플랫폼 메인]");
            for (int a = 0; a < category.size(); a++) {
                Category ctgy = category.get(a);
                System.out.println((a + 1) + ". " + ctgy.getCategoryName());
            }
            System.out.println("0. 종료");
            int i = sc.nextInt();

            List<Product> products = category.get(i-1).getProducts();

            if (i == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            } else if (i < 0 || i > category.size()) {
                System.out.println("잘못된 호출입니다.\n");
                continue;
            }
            int e = 1;
            switch (i) {
                case 1 :
                    System.out.println("[전자제품 카테고리]");
                    break;
                case 2 :
                    System.out.println("[의류 카테고리]");
                    break;
                case 3 :
                    System.out.println("[식품 카테고리]");
                    break;
            }
            for (Product pd : category.get(i - 1).getProducts()) {
                System.out.printf(+e + ". %-10s | %,10d원 | %-15s %n", pd.getProductName(), pd.getPrice(), pd.getDescription());
                e++;
            }
            System.out.println("0. 뒤로가기");
            int j = sc.nextInt();
            if (j == 0) {
                continue;
            } else if (j < 0 || j > products.size()) {
                System.out.println("잘못된 호출입니다.\n");
                continue;
            }

            Product pd2 = products.get(j-1);
            System.out.printf("선택한 제품: %-10s | %,10d원 | %-15s | 재고: %d개 %n", pd2.getProductName(), pd2.getPrice(), pd2.getDescription(), pd2.getStockQuantity());
            System.out.println();
        }
    }
}

