package BlackJack;

import BlackJack.interfaces.ICard;
import BlackJack.interfaces.IDealer;

public class Dealer extends Player implements IDealer {
    public Dealer() {
        super("Крупье");
    }

    @Override
    public boolean isNeedAnotherCard() {
        return countValues() < 17;
    }

    @Override
    public void openCards() {
        for (ICard card : cards) {
            card.open();
            if (!BlackJack.isGameFinish) {
                break;
            }
        }
    }
}
