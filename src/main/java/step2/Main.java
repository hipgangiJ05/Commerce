package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        CommerceSystem cs = new CommerceSystem(products);

        Product pd = new Product(
                "Galaxy S25",
                1200000,
                "최신 안드로이드 스마트폰",
                200
        );
        products.add(pd);

        Product pd2 = new Product(
                "iphone 16",
                1350000,
                "Apple의 최신 스마트폰",
                350
        );
        products.add(pd2);

        Product pd3 = new Product(
                "MacBook Pro",
                2400000,
                "M3 칩셋이 탑재된 노트북",
                50
        );
        products.add(pd3);

        Product pd4 = new Product(
                "AirPods Pro",
                350000,
                "노이즈 캔슬링 무선 이어폰",
                500
        );
        products.add(pd4);

        cs.start();
    }
}
