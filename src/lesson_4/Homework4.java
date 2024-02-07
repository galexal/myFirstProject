package lesson_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Homework4 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        arrayChecker(getRandomIntArray());
    }

    private static int[] getRandomIntArray() {
        int arraySize = random.nextInt(10);
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static void arrayChecker(int[] array) {
        int evenNumbersQuantity = 0;
        List<Integer> from10to25numbers = new ArrayList<>();
        List<Integer> reversList = new ArrayList<>();
        List<Integer> numbersWithDigit4 = new ArrayList<>();

        for (int j : array) {
            if (j % 2 == 0) {
                evenNumbersQuantity++;
            }
            if (j > 10 && j < 25) {
                from10to25numbers.add(j);
            }
            reversList.add(0, j);
            if (j % 3 == 0) {
                reversList.add(0, j);
            }
            if (String.valueOf(j).contains("4")) {
                numbersWithDigit4.add(j);
            }
        }

        String output = "Дан массив " + Arrays.toString(array) + ".\n" +
                "В массиве " + evenNumbersQuantity + " четных чисел.\n" +
                "Числа из массива, которые больше 10, но меньше 25: " + from10to25numbers + ".\n" +
                "Числа из массива в обратном порядке с дублированием кратных 3: " + reversList + ".\n" +
                "Числа, содержащие цифру 4: " + numbersWithDigit4;

        System.out.println(output);
    }
}
