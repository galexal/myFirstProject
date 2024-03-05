package lesson_12;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private int denomination;
    private int year;
    private double diameter;
    private String metal;

    public Coin(int denomination, int year, double diameter, String metal) {
        this.denomination = denomination;
        this.year = year;
        this.diameter = diameter;
        this.metal = metal;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return denomination == coin.denomination && year == coin.year && Double.compare(coin.diameter, diameter) == 0 && metal.equals(coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denomination, year, diameter, metal);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "denomination=" + denomination +
                ", year=" + year +
                ", diameter=" + String.format("%.2f",diameter) +
                ", metal='" + metal + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        if (getDenomination() != o.getDenomination()) {
            return getDenomination() - o.getDenomination();
        }

        if (getYear() != o.getYear()) {
            return getYear() - o.getYear();
        }

        if (getDiameter() != o.getDiameter()) {
            return getDiameter() - o.getDiameter() < 0 ? -1 : getDiameter() - o.getDiameter() == 0 ? 0 : 1;
        }

        return getMetal().compareTo(o.getMetal());
    }
}
