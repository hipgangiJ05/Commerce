package step3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Category> cgList = new ArrayList<>();
        List<Product> electronicsPd = new ArrayList<>();
        List<Product> clothingPd = new ArrayList<>();

        Category electronicsCg = new Category("전자제품", electronicsPd);
        cgList.add(electronicsCg);

        Category clothingCg = new Category("의류", clothingPd);
        cgList.add(clothingCg);

        Product pd = new Product(
                "Galaxy S25",
                1200000,
                "최신 안드로이드 스마트폰",
                200
        );
        electronicsPd.add(pd);

        Product pd2 = new Product(
                "iphone 16",
                1350000,
                "Apple의 최신 스마트폰",
                350
        );
        electronicsPd.add(pd2);

        Product pd3 = new Product(
                "MacBook Pro",
                2400000,
                "M3 칩셋이 탑재된 노트북",
                50
        );
        electronicsPd.add(pd3);

        Product pd4 = new Product(
                "AirPods Pro",
                350000,
                "노이즈 캔슬링 무선 이어폰",
                500
        );
        electronicsPd.add(pd4);

        CommerceSystem cs = new CommerceSystem(cgList);

        for (int a = 0; a < cgList.size(); a++) {
            Category category = cgList.get(a);
            System.out.println(category.categoryName);;
        }
    }
}