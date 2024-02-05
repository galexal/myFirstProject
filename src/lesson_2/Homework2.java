package lesson_2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        printNumberParity(1);
        printNumberParity(2);
        System.out.println();

        printMaxNumber(1, 4, 3, 4);
        printMaxNumber(-5, 0, 24, -18);
        System.out.println();

        printQuadrilateralType(1, 1 , 1, 1);
        printQuadrilateralType(2, 1 , 2, 1);
        System.out.println();

        matchChecker(-5, -8);
        matchChecker(5, 8);
        matchChecker(-5, 8);
        matchChecker(15, 8);
    }

    private static void printNumberParity(int number) {
        System.out.println(number + (number % 2 == 0 ? " четное" : " нечетное"));
    }

    private static void printMaxNumber(int... numbers) {
        System.out.println("из " + Arrays.toString(numbers) + " максимальное " + Arrays.stream(numbers).max().getAsInt());
    }

    /**
     * Вывод типа прямоугольника по длинам его сторон.
     * Для определения других типов четырехугольников нужны значения углов.
     * @param firstSideLength
     * @param secondSideLength
     * @param thirdSideLength
     * @param fourthSideLength
     */
    private static void printQuadrilateralType(double firstSideLength, double secondSideLength,
                                        double thirdSideLength, double fourthSideLength) {
        System.out.printf("Четырехугольник со сторонами %.2f %.2f %.2f %.2f является %s%n",
                firstSideLength, secondSideLength, thirdSideLength, fourthSideLength,
                firstSideLength == secondSideLength && thirdSideLength == fourthSideLength
                        && firstSideLength == thirdSideLength ? "квадратом" : "прямоугольником");
    }

    private static void matchChecker(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        boolean isMatching = sum < 0 || sum >= 10 && sum <= 20;
        System.out.println(isMatching);
    }
}
