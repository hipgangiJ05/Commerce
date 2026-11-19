package Challenge.Lv1;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner scanner = new Scanner(System.in);
    List<Category> categoryList;

    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public void start() {
        while (true) {
            System.out.println("[실시간 커머스 플랫폼 메인]");
            for (int ctgy = 0; ctgy < categoryList.size(); ctgy++) {
                Category category = categoryList.get(ctgy);
                System.out.printf((ctgy + 1) + ". %-10s %n", category.getCategryName());
            }
            System.out.println("0. 종료");
            int n1 = scanner.nextInt();

            switch (n1) {
                case 0:
                    System.out.print("프로그램을 종료합니다");
                    System.exit(0);
                case 1:
                    System.out.println("[전자제품 카테고리]");
                    break;
                case 2:
                    System.out.println("[의류 카테고리]");
                    break;
                case 3:
                    System.out.println("[식품 카테고리]");
                    break;
                default:
                    System.out.println("유효하지 않은 호출입니다.\n");
                    continue;
            }

            List<Product> products = categoryList.get(n1-1).getProducts();
            int pd =1;
            for (Product product : products) {
                System.out.printf(pd+". %-10s | %,10d | %-15s %n", product.getProductName(), product.getPrice(), product.getDescription(), product.getStockQuantity());
                pd++;
            }
            System.out.println("0. 뒤로가기");
            int prdt = scanner.nextInt();

            if (prdt == 0) {
                continue;
            } else if (prdt > products.size()) {
                System.out.println("유효하지 않은 호출입니다.");
                continue;
            }
            Product slectProduct = products.get(prdt-1);
            System.out.printf("선택한 제품: %-10s | %,10d개 | %-15s | 재고: %d개 %n", slectProduct.getProductName(), slectProduct.getPrice(), slectProduct.getDescription(), slectProduct.getStockQuantity());
        }
    }
}