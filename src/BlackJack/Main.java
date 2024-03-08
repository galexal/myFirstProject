package BlackJack;

import BlackJack.interfaces.IBlackJack;
import BlackJack.interfaces.IDealer;
import BlackJack.interfaces.IPlayer;

public class Main {

    public static void main(String[] args) {
        IBlackJack game = new BlackJack();
        System.out.println("Игра началась");

        IPlayer player1 = new Player("Айрат");
        IPlayer player2 = new Player("Максим");
        IPlayer player3 = new Player("Дима");
        IDealer dealer = new Dealer();

        game.addPlayerToGame(player1);
        game.addPlayerToGame(player2);
        game.addPlayerToGame(player3);
        game.addPlayerToGame(dealer);

        game.dealTwoCards();
        game.addCardsToPlayer();

        game.printWinners();

    }
}
