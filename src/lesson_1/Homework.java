package lesson_1;

import java.math.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {
    public static void main(String[] args) {
        BigDecimal accountBalance = new BigDecimal("1000");

        List<String> products = Arrays.asList("пицца", "шоколадка", "конфета");

        Map<String, String> prices = new HashMap<>();
        prices.put("пицца", "230");
        prices.put("шоколадка", "22");
        prices.put("конфета", "2.5");

        StringBuilder output = new StringBuilder("На эти деньги можно купить:\n");

        for (String productName :
                products) {
            BigDecimal productPrice = new BigDecimal(prices.get(productName));
            BigDecimal quantity = accountBalance.divide(productPrice, RoundingMode.FLOOR);
            accountBalance = accountBalance.subtract(productPrice.multiply(quantity));

            output.append(String.format("- %s - %s шт.\n", productName, quantity));
        }

        output.append(String.format("Сдача: %s руб.", accountBalance));
        System.out.println(output);
    }
}
