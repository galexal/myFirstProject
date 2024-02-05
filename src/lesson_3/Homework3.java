package lesson_3;

import java.util.HashMap;
import java.util.Map;

public class Homework3 {
    public static void main(String[] args) {

    }

    private static void geometryFormulas() {
        Map<String, String> formulas = new HashMap<>();

        formulas.put("прямоугольник", "S=a*b; P=2*(a+b)");
        formulas.put("квадрат", "S=a*a; P=4*a");
        formulas.put("круг", "S=Pi*r*r; P=2*Pi*r");
    }
}
