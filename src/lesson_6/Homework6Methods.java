package lesson_6;

public class Homework6Methods {
    /**
     * Расчет площади треугольника по длинам его сторон.
     *
     * @param firstSideLength  длина первой стороны
     * @param secondSideLength длина второй стороны
     * @param thirdSideLength  длина третьей стороны
     * @return площадь треугольника
     */
    static double getTriangleArea(double firstSideLength, double secondSideLength, double thirdSideLength) {
        double semiPerimeter = (firstSideLength + secondSideLength + thirdSideLength) / 2.0;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSideLength)
                * (semiPerimeter - secondSideLength) * (semiPerimeter - thirdSideLength));
    }

    /**
     * Подсчет гласных в английском/русском тексте
     *
     * @param text заданный текст
     * @return количество гласных в тексте
     */
    static int getVowelCount(String text) {
        String englishVowels = "AEIOUYaeiouy";
        String russianVowels = "АУОИЭЫЯЮЕЁауоиэыяюеё";
        int vowelsCount = 0;
        for (char letter :
                text.toCharArray()) {
            if (englishVowels.contains(letter + "") || russianVowels.contains(letter + "")) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    /**
     * Вывод в консоль ромба.
     *
     * @param arrayLength размер массива
     */
    static void printRhombus(int arrayLength) {
        if (arrayLength % 2 != 1) {
            System.out.println("Размер массива должен быть нечетным.");
            return;
        }
        Character[][] rhombus = new Character[arrayLength][arrayLength];
        int startIndex = arrayLength / 2;
        int endIndex = arrayLength / 2;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (j >= startIndex && j <= endIndex) {
                    rhombus[i][j] = '*';
                } else {
                    rhombus[i][j] = ' ';
                }
            }
            if (i < arrayLength / 2) {
                startIndex--;
                endIndex++;
            } else {
                startIndex++;
                endIndex--;
            }
        }
        printTwoDimensionalArray(rhombus);
    }

    /**
     * Печать двумерного массива в консоль.
     * @param array двумерный массив
     * @param <T> тип данных в массиве
     */
    static <T> void printTwoDimensionalArray(T[][] array) {
        for (T[] ts : array) {
            for (T t : ts) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
