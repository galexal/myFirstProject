package lesson_10.fraction;

import java.util.Objects;

public class Fraction implements IFraction {
    private int numerator;
    private int denominator;

    @Override
    public String toString() {
        return "Простая дробь " +
                "с числителем " + numerator +
                " и знаменателем " + denominator;
    }

    @Override
    public void setNumerator(int value) {
        numerator = value;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public void setDenominator(int value) {
        denominator = value;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Знаменатель не может быть равен 0. Ему присвоено значение 1");
            denominator = 1;
        }
        int gcd = getGCD(numerator, denominator);
        this.numerator = gcd == 1 ? numerator : numerator / gcd;
        this.denominator = gcd == 1 ? denominator : denominator / gcd;
    }

    private int getGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a - b);
    }
}
