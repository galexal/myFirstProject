package lesson_10.fraction;

public class Main {
    public static void main(String[] args) {
        IFraction fraction1 = new Fraction(3, 5);
        IFraction fraction2 = new Fraction(4, 9);

        IFractionCalc calc = new FractionCalc();
        System.out.println(calc.mul(fraction1,fraction2));
    }
}
