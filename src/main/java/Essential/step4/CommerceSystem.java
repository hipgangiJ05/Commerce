package Essential.step4;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner scanner = new Scanner(System.in);
    private List<Category> categoryList;
    private List<Product> products;

    CommerceSystem (List<Category> categoryList) {
        this.categoryList = categoryList;

    }

    public void start () {
        while (true) {
            System.out.println("[실시간 커머스 플랫폼 메인]");
            for (int a = 0; a < categoryList.size(); a++) {
                Category category = categoryList.get(a);
                System.out.printf((a + 1) + ". %-15s %n", category.getCategoryName());
            }
            System.out.println("0. 종료");
            int c = scanner.nextInt();

            switch (c) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("[전자기기 카테고리]");
                    break;
                case 2:
                    System.out.println("[의류 카테고리]");
                    break;
                case 3:
                    System.out.println("[식품 카테고리]");
                    break;
                default:
                    System.out.println("유효하지 않은 호출입니다 \n");
                    continue;
            }
            List<Product> products = categoryList.get(c-1).getProduct();
            int n = 1;
            for (Product product : products) {
                System.out.printf(n+". %-10s | %,10d원 | %-15s %n",product.getProductName(), product.getPrice(), product.getDescription());
                n++;
            }
            System.out.println("0. 뒤로가기");
            int pd = scanner.nextInt();
            if (pd == 0) {
                continue;
            } else if (pd > products.size()) {
                System.out.println("유효하지 않은 호출입니다 \n");
                continue;
            }
            pd -=1;
            System.out.printf("선택한 제품: %-10s | %,10d원 | %-15s | 재고: %,d개 %n",products.get(pd).getProductName(), products.get(pd).getPrice(), products.get(pd).getDescription(), products.get(pd).getStockQuantity());
        }
    }
}
