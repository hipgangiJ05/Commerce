package step3;

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
            if (i == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            } else if (i < 0 || i > category.size()) {
                System.out.println("잘못된 호출입니다.\n");
                continue;
            }
            int e = 1;
            for (Product pd : category.get(i - 1).getProducts()) {
                System.out.printf(e + ". %-15s | %,10d | %-15s %n", pd.getProductName(), pd.getPrice(), pd.getDescription());
                e++;
            }


            //switch (i) {
            //    case 0 :
            //        System.exit(0);
            //        break;
            //    case 1 :

        }
    }
}

