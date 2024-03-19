package lesson_15;

public class Main {
    public static void main(String[] args) {
        StringUtilsImpl stringUtils = new StringUtilsImpl();

        try {
            System.out.println(stringUtils.div("10", "2.5"));
        } catch (NullPointerException e) {
            System.out.println("В метод передан null");
        } catch (NumberFormatException e) {
            System.out.println("Хотя бы один из аргументов не является числом");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            int[] wordIndexes = stringUtils.findWord("test hjhsd test jjhjtestnmn", "test");
            for (int wordIndex : wordIndexes) {
                System.out.println(wordIndex);
            }
        } catch (NullPointerException e) {
            System.out.println("В метод передан null");
        }

        try {
            double[] numbers = stringUtils.findNumbers("dffdf3.14dsd fd 45 dddf.14");
            for (double number : numbers) {
                System.out.println(number);
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
