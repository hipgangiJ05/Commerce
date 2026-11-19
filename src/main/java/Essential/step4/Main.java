package Essential.step4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Category> categoryList = new ArrayList<>();
        CommerceSystem cs = new CommerceSystem(categoryList);

        List<Product> electronicProduct = new ArrayList<>();
        Category eletronicCategory = new Category("전자제품", electronicProduct);
                categoryList.add(eletronicCategory);
            Product edpd = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 200);
                electronicProduct.add(edpd);
            Product edpd2 = new Product("iphone 16", 1350000, "Apple의 최신 스마트폰", 350);
                electronicProduct.add(edpd2);
            Product edpd3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 50);
                electronicProduct.add(edpd3);
            Product edpd4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 500);
                electronicProduct.add(edpd4);

        List<Product> clothingProduct = new ArrayList<>();
        Category clothingCategory = new Category("의류", clothingProduct);
                categoryList.add(clothingCategory);
            Product clpd = new Product("크루넥 T", 19900, "일상에서 편하게 입는 면 티셔츠", 50);
                clothingProduct.add(clpd);
            Product clpd2 = new Product("배럴진", 59900, "허벅지부터 밑단까지 둥글게 떨어지는 곡선형 청바지", 80);
                clothingProduct.add(clpd2);
            Product clpd3 = new Product("옥스퍼드 셔츠", 39900, "탄탄한 면 소재와 단정한 카라 디자인", 35);
                clothingProduct.add(clpd3);
            Product clpd4 = new Product("스웨트 풀파카", 49900, "넉넉한 핏과 후드가 특징인 기본 풀오버형 맨투맨 후드", 120);
                clothingProduct.add(clpd4);

        List<Product> foodProduct = new ArrayList<>();
        Category foodCategory = new Category("식품", foodProduct);
                categoryList.add(foodCategory);
            Product fdpd = new Product("황금올리브치킨", 23000, "BBQ 대표 후라이드 치킨", 240);
                foodProduct.add(fdpd);
            Product fdpd2 =new Product("황금올리브 양념", 25500, "바삭하게 튀긴 치킨에 달콤하면서도 매콤한 양념", 180);
                foodProduct.add(fdpd2);
            Product fdpd3 = new Product("자메이카 통다리", 24000, "자메이카식 저크 소스를 발라 구워낸 큼직한 통다리", 320);
                foodProduct.add(fdpd3);

        cs.start();
    }
}
