package Essential.step3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Category> cgList = new ArrayList<>();
        List<Product> electronicsList = new ArrayList<>();

        Category electronicsCg = new Category("전자제품", electronicsList);
        cgList.add(electronicsCg);

        Product etpd = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 200);
        electronicsList.add(etpd);
        Product etpd2 = new Product("iphone 16", 1350000, "Apple의 최신 스마트폰", 350);
        electronicsList.add(etpd2);
        Product etpd3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 50);
        electronicsList.add(etpd3);
        Product etpd4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 500);
        electronicsList.add(etpd4);

        List<Product> clothingList = new ArrayList<>();
        Category clothingCg = new Category("의류", clothingList);
        cgList.add(clothingCg);

        Product ctpd = new Product("크루넥 T", 19900, "일상에서 편하게 입는 면 티셔츠", 50);
        clothingList.add(ctpd);
        Product ctpd2 = new Product("배럴진", 59900, "허벅지부터 밑단까지 둥글게 떨어지는 곡선형 청바지", 80);
        clothingList.add(ctpd2);
        Product ctpd3 = new Product("옥스퍼드 셔츠", 39900, "탄탄한 면 소재와 단정한 카라 디자인", 35);
        clothingList.add(ctpd3);
        Product ctpd4 = new Product("스웨트 풀파카", 49900, "넉넉한 핏과 후드가 특징인 기본 풀오버형 맨투맨 후드", 120);
        clothingList.add(ctpd4);

        List<Product> foodList = new ArrayList<>();
        Category foodCg = new Category("식품", foodList);
        cgList.add(foodCg);

        Product fdpd = new Product("황금올리브치킨", 23000, "BBQ 대표 후라이드 치킨", 240);
        foodList.add(fdpd);
        Product fdpd2 =new Product("황금올리브 양념", 25500, "바삭하게 튀긴 치킨에 달콤하면서도 매콤한 양념", 180);
        foodList.add(fdpd2);
        Product fdpd3 = new Product("자메이카 통다리구이", 24000, "자메이카식 저크 소스를 발라 구워낸 큼직한 통다리", 320);
        foodList.add(fdpd3);

        CommerceSystem cs = new CommerceSystem(cgList);
        cs.start();
    }
}