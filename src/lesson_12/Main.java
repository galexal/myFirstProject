package lesson_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coin> coinsCollection = createCoinsCollection();
        for (Coin coin :
                coinsCollection) {
            System.out.println(coin);
        }
        System.out.println();

        System.out.println("Дефолтная сортировка (по номиналу) по возрастанию");
        Collections.sort(coinsCollection);
        for (Coin coin :
                coinsCollection) {
            System.out.println(coin);
        }
        System.out.println();

        System.out.println("Дефолтная сортировка (по номиналу) по убыванию");
        Collections.reverse(coinsCollection);
        for (Coin coin :
                coinsCollection) {
            System.out.println(coin);
        }
        System.out.println();

        System.out.println("Сортировка по году");
        coinsCollection.sort(new CoinComparatorByYear());
        for (Coin coin :
                coinsCollection) {
            System.out.println(coin);
        }
        System.out.println();

        System.out.println("Сортировка по диаметру по убыванию");
        coinsCollection.sort(new CoinComparatorByDiameter().reversed());
        for (Coin coin :
                coinsCollection) {
            System.out.println(coin);
        }
        System.out.println();

        System.out.println("Сортировка по металлу");
        coinsCollection.sort(new CoinComparatorByMetal());
        for (Coin coin :
                coinsCollection) {
            System.out.println(coin);
        }
        System.out.println();

        System.out.println("Сортировка по металлу по убыванию");
        coinsCollection.sort(new CoinComparatorByMetalDesc());
        for (Coin coin :
                coinsCollection) {
            System.out.println(coin);
        }
        System.out.println();


    }

    private static ArrayList<Coin> createCoinsCollection() {
        Random random = new Random();
        String[] metals = {"золото", "алюминий", "цинк", "никель", "палладий", "платина"};
        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            coins.add(new Coin(random.nextInt(50), random.nextInt(1900,2000),
                    random.nextDouble(10), metals[random.nextInt(6)]));
        }
        return coins;
    }
}
