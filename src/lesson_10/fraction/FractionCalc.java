package lesson_10.fraction;

public class FractionCalc implements IFractionCalc {


    private int getLCM(int a, int b) {
        int lcm = a;
        while (lcm % a != 0 || lcm % b != 0) {
            lcm += a;
        }
        return Math.abs(lcm);
    }

    @Override
    public IFraction sum(IFraction fraction1, IFraction fraction2) {
        int lcm = getLCM(fraction1.getDenominator(), fraction2.getDenominator());
        int numerator = fraction1.getDenominator() == fraction2.getDenominator()
                ? fraction1.getNumerator() + fraction2.getNumerator()
                : fraction1.getNumerator() * lcm / fraction1.getDenominator()
                + fraction2.getNumerator() * lcm / fraction2.getDenominator();
        int denominator = fraction1.getDenominator() == fraction2.getDenominator()
                ? fraction1.getNumerator() : lcm;
        return new Fraction(numerator, denominator);
    }

    @Override
    public IFraction sub(IFraction fraction1, IFraction fraction2) {
        int lcm = getLCM(fraction1.getDenominator(), fraction2.getDenominator());
        int numerator = fraction1.getDenominator() == fraction2.getDenominator()
                ? fraction1.getNumerator() - fraction2.getNumerator()
                : fraction1.getNumerator() * lcm / fraction1.getDenominator()
                - fraction2.getNumerator() * lcm / fraction2.getDenominator();
        int denominator = fraction1.getDenominator() == fraction2.getDenominator()
                ? fraction1.getNumerator() : lcm;
        return new Fraction(numerator, denominator);
    }

    @Override
    public IFraction mul(IFraction fraction1, IFraction fraction2) {
        return new Fraction(fraction1.getNumerator() * fraction2.getNumerator(),
                fraction1.getDenominator() * fraction2.getDenominator());
    }

    @Override
    public IFraction div(IFraction fraction1, IFraction fraction2) {
        return new Fraction(fraction1.getNumerator() * fraction2.getDenominator(),
                fraction1.getDenominator() * fraction2.getNumerator());
    }
}