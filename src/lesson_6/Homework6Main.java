package lesson_6;

import static lesson_6.Homework6Methods.*;

public class Homework6Main {
    public static void main(String[] args) {
        double a = 5, b = 6, c = 7;
        System.out.printf("Площадь треугольника со сторонами %.1f, %.1f, %.1f составляет %.1f\n", a, b, c,
                getTriangleArea(a, b, c));
        System.out.println();

        String testText = "Тестовый text";
        System.out.printf("= = = = =\n%s\n= = = = =\nВ заданном тексте %d гласных.\n",
                testText,getVowelCount(testText));
        System.out.println();

        printRhombus(7);
        System.out.println();

        Integer[][] testArray = {{1,2,3},{4,5,6}};
        printTwoDimensionalArray(testArray);
    }
}
