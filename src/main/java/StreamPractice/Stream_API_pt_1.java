package StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_API_pt_1 {
    @FunctionalInterface
    interface myCalc {
        double discount(double price);
    }

    public static void main(String[] args) {
        List<Map<String, Object>> products = Arrays.asList(
                Map.of("name", "Laptop", "price", 1200.0),
                Map.of("name", "SmartPhone", "price", 800.0),
                Map.of("name", "Tablet", "price", 1000.0)
        );

        // 익명 내부 클래스를 사용한 구현
        myCalc calcWithClass = new myCalc() {
            @Override
            public double discount(double price) {
                return price * 0.9;
            }
        };

        // 람다를 사용한 구현
        myCalc calcWithLambda = price -> price * 0.9;
        // 스트림과 람다를 사용해 할인 적용 및 정렬
        List<String> discountedProducts = products.stream()
                .map(product -> Map.of(
                        "name", product.get("name"),
                        "discountPrice", calcWithLambda.discount((Double) product.get("price"))
                ))
                .sorted(Comparator.comparingDouble(product -> (double) product.get("discountPrice")))
                .map(product -> product.get("name") + ": " + String.format("%.2f", product.get("discountPrice")) + "원")
                .collect(Collectors.toList());


    }
}
