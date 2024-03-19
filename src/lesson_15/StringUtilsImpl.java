package lesson_15;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        return Double.parseDouble(number1) / Double.parseDouble(number2);
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        List<Integer> indexes = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            indexes.add(matcher.start());
        }
        int[] result = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            result[i] = indexes.get(i);
        }
        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        List<Double> indexes = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            indexes.add(Double.parseDouble(text.substring(matcher.start(), matcher.end())));
        }
        if (indexes.isEmpty()) {
            throw new CustomException("Чисел в тексте не обнаружено");
        }
        double[] result = new double[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            result[i] = indexes.get(i);
        }
        return result;
    }
}
