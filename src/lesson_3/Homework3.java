package lesson_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        geometryFormulas();

        printNumbersFrom40to20();

        printOddNumbersSum();

        printLineNumber();
        System.out.println(getGCD(15, 9));
    }

    private static void geometryFormulas() {
        Map<String, String> formulas = new HashMap<>();

        formulas.put("прямоугольник", "S=a*b; P=2*(a+b)");
        formulas.put("квадрат", "S=a*a; P=4*a");
        formulas.put("круг", "S=Pi*r*r; P=2*Pi*r");

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Введите название фигуры или \"выход\"");
            input = scanner.nextLine();
            System.out.println(formulas.getOrDefault(input, "Нет данных"));
        } while (!input.equalsIgnoreCase("выход"));
    }

    private static void printNumbersFrom40to20() {
        for (int i = 40; i >= 20; i--) {
            System.out.println(i);
        }
    }

    private static void printOddNumbersSum() {
        int sum = 0;
        for (int i = 21; i < 60; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void printLineNumber() {
        for (int i = 1; i <= 20 ; i++) {
            System.out.println("Это строка номер " + i);
        }
    }

    private static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a - b);
    }
}
