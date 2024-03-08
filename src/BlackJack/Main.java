package BlackJack;

import BlackJack.interfaces.IBlackJack;

public class Main {

    public static void main(String[] args) {
        IBlackJack game = new BlackJack();
        game.start();
    }
}
