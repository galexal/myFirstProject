package lesson_10.fraction;

public interface IFractionCalc {

    IFraction sum(IFraction fraction1, IFraction fraction2);
    IFraction sub(IFraction fraction1, IFraction fraction2);
    IFraction mul(IFraction fraction1, IFraction fraction2);
    IFraction div(IFraction fraction1, IFraction fraction2);
}
