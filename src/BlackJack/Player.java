package BlackJack;

import BlackJack.interfaces.ICard;
import BlackJack.interfaces.IPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Player implements IPlayer {
    List<ICard> cards = new ArrayList<>();
    private final String name;
    private boolean isLose;

    @Override
    public boolean isLose() {
        return isLose;
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void addCardToHand(ICard card) {
        cards.add(card);
    }

    @Override
    public boolean isNeedAnotherCard() {
        if (countValues() >= 21) {
            if (countValues() > 21) {
                isLose = true;
            }
            return false;
        }
        System.out.println(name + ", нужна ли еще карта? Да/нет");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return "да".equalsIgnoreCase(answer);
    }

    @Override
    public void openCards() {
        for (ICard card : cards) {
            card.open();
        }
    }

    @Override
    public int countValues() {
        int sum = 0;
        for (ICard card : cards) {
            sum += card.getValue();
        }
        if (sum > 21) {
            for (ICard card : cards) {
                if (card.getValue() == 11) {
                sum -= 10;
                }
            }
        }
        return sum;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Игрок " + name;
    }
}
