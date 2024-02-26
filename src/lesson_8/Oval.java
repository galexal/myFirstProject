package lesson_8;

import java.util.Objects;

public class Oval extends Circle {
    double radius2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oval oval = (Oval) o;
        return Double.compare(oval.radius2, radius2) == 0 && Double.compare(oval.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius2, radius);
    }

    public Oval(double radius, double radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    @Override
    public String toString() {
        return "Oval{" +
                "radius2=" + radius2 +
                ", radius=" + radius +
                '}';
    }

    @Override
    double getArea() {
        return Math.PI * (radius + radius2);
    }

    @Override
    double getPerimeter() {
        return 4 * (Math.PI * radius * radius2 + (radius - radius2)) / (radius + radius2);
    }
}
