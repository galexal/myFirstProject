package BlackJack;

import BlackJack.interfaces.IBlackJack;
import BlackJack.interfaces.IDeck;
import BlackJack.interfaces.IPlayer;

import java.util.*;

public class BlackJack implements IBlackJack {

    IDeck deck = new Deck();
    private final List<IPlayer> players = new ArrayList<>();

    public static boolean isGameFinish;
    private int dealerScore;


    @Override
    public void start() {
        addPlayersToGame();
        dealTwoCards();
        addCardsToPlayer();
    }

    @Override
    public void dealTwoCards() {
        for (IPlayer player : players) {
            player.addCardToHand(deck.getRandomCard());
            player.addCardToHand(deck.getRandomCard());
        }
    }

    @Override
    public void addCardsToPlayer() {
        for (IPlayer player : players) {
            while (player.isNeedAnotherCard()) {
                player.addCardToHand(deck.getRandomCard());
                if (!(player instanceof Dealer)) {
                    showGameInfo();
                }
            }
            if (players.indexOf(player) == players.size() - 1) {
                isGameFinish = true;
            }
            showGameInfo();
        }
    }

    @Override
    public void addPlayersToGame() {
        players.add(new Dealer());
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            showGameInfo();
            System.out.println("Введите имя игрока или \"старт\", если игроков больше нет:");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("старт")) {
                if (players.size() < 2) {
                    System.out.println("Для игры необходим хотя бы один игрок");
                } else {
                    break;
                }
            } else {
                if (players.contains(new Player(input))) {
                    System.out.println("Игрок с таким именем уже существует.");
                } else {
                    players.add(new Player(input));
                }
            }
        }
    }

    public void showGameInfo() {
        for (IPlayer player :
                players) {
            if (!isGameFinish) {
                System.out.println(player.getName() + (player.isLose() ? " проиграл" : ""));
            } else {
                if (player instanceof Dealer) {
                    System.out.println(player.getName());
                    dealerScore = player.countValues();
                } else {
                    if (player.isLose()) {
                        System.out.println(player.getName() + " проиграл");
                    } else if (player.countValues() == dealerScore) {
                        System.out.println(player.getName() + " ничья");
                    } else {
                        System.out.println(player.getName() + " выиграл");
                    }
                }
            }
            player.openCards();
            System.out.println("------------------");
        }
    }
}
