package lesson_8;

public class Rectangle extends Figure{
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double getArea() {
        return sideA * sideB;
    }

    @Override
    double getPerimeter() {
        return 2 * (sideA + sideB);
    }
}
