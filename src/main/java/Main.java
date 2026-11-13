import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product pd = new Product(
                "Galaxy S25",
                1200000,
                "최신 안드로이드 스마트폰",
                200
        );

        System.out.printf("%-10s | %,10d원 | %-10s", pd.getProductName(), pd.getPrice(), pd.getDescription());
        
    }
}
