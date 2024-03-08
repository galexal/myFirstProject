package lesson_12;

import java.util.Comparator;

public class CoinComparatorByMetalDesc implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        if (!o1.getMetal().equals(o2.getMetal())) {
            return -1 * (o1.getMetal().compareTo(o2.getMetal()));
        }

        if (o1.getDenomination() != o2.getDenomination()) {
            return o1.getDenomination() - o2.getDenomination();
        }

        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }

        return o1.getDiameter() - o2.getDiameter() < 0 ? -1 : o1.getDiameter() - o2.getDiameter() == 0 ? 0 : 1;
    }
}
