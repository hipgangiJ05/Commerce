package Challenge.Lv1;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner scanner = new Scanner(System.in);
    List<Category> categoryList;
    ShoppingCart shoppingCart = new ShoppingCart();

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
            if (!shoppingCart.getStoreProduct().isEmpty()) {
                System.out.println("\n[주문 관리]\n4. 장바구니 확인\n5. 주문 취소");
            }

            System.out.println("0. 종료");
            int n1 = scanner.nextInt();

            switch (n1) {
                case 0:
                    System.out.print("프로그램을 종료합니다");
                    System.exit(0);
                case 1:
                    System.out.println("\n[전자제품 카테고리]");
                    break;
                case 2:
                    System.out.println("\n[의류 카테고리]");
                    break;
                case 3:
                    System.out.println("\n[식품 카테고리]");
                    break;
                case 4 :
                    if (shoppingCart.getStoreProduct().isEmpty()) {
                        continue;
                    }
                    System.out.println("[장바구니 목록]");
                    for (Product storePd : shoppingCart.getStoreProduct()) {
                        System.out.printf("%-10s | %,10d원 | %-15s | 수량: %d개 %n", storePd.getProductName(), storePd.getPrice(), storePd.getDescription(), storePd.getQuantity());
                    }
                    System.out.println("[총 주문 금액]");
                    System.out.printf("%,d원 %n", shoppingCart.totalAmount());
                    System.out.println("\n주문하시겠습니까? [Y/N]");
                    char order = scanner.next().charAt(0);

                    if (order == 'Y') {
                        System.out.println("주문이 완료되었습니다.");
                        shoppingCart.productElimination();
                    }

                    continue;
                case 5 :
                    if (shoppingCart.getStoreProduct().isEmpty()) {
                        continue;
                    }
                    continue;
                default:
                    System.out.println("유효하지 않은 호출입니다.\n");
                    continue;
            }

            List<Product> products = categoryList.get(n1 - 1).getProducts();
            int pd = 1;
            for (Product product : products) {
                System.out.printf(pd + ". %-10s | %,10d원 | %-15s %n", product.getProductName(), product.getPrice(), product.getDescription(), product.getStockQuantity());
                pd++;
            }
            System.out.println("0. 뒤로가기");
            int prdt = scanner.nextInt();

            if (prdt == 0) {
                continue;
            } else if (prdt < 1 ||prdt > products.size()) {
                System.out.println("유효하지 않은 호출입니다.");
                continue;
            }
            Product selectProduct = products.get(prdt - 1);

            System.out.printf("\n선택한 제품: %-10s | %,10d원 | %-15s | 재고: %d개 %n", selectProduct.getProductName(), selectProduct.getPrice(), selectProduct.getDescription(), selectProduct.getStockQuantity());
            System.out.println("장바구니에 담으시겠습니까? [Y/N]");
            char addStore = scanner.next().charAt(0);

            if (addStore == 'Y') {
                boolean bk = false;
                for (Product addProduct : shoppingCart.getStoreProduct()) {
                    if (addProduct.getProductName().equals(selectProduct.getProductName())) {
                        selectProduct.setQuantity(selectProduct.getQuantity() +1);
                        bk = true;
                    }
                }
                if (!bk) {
                    shoppingCart.addStoreProduct(selectProduct);
                    selectProduct.setQuantity(selectProduct.getQuantity() +1);
                }

                System.out.println("\n"+selectProduct.getProductName()+"가 장바구니에 담겼습니다\n");
            }
        }
    }
}