package BlackJack;

import BlackJack.interfaces.IBlackJack;
import BlackJack.interfaces.IDeck;
import BlackJack.interfaces.IPlayer;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class BlackJack implements IBlackJack {

    IDeck deck = new Deck();
    private Set<IPlayer> players = new HashSet<>();

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
            while (player.isNeedAnotherCard()){
                player.addCardToHand(deck.getRandomCard());
            }
        }
    }

    @Override
    public void printWinners() {
        // у всех перебор - победил крупье
        // перебор у всех, кроме 1 игрока - победил текущий игрок
        // несколько человек с очками до 21 - 1 или несколько победителей с максимальными очками
        Set<IPlayer> notBustPlayer = new HashSet<>();
        for (IPlayer player : players) {
            if(player.countValues()<=21){
                notBustPlayer.add(player);
            }
        }

        if (notBustPlayer.isEmpty()){
            System.out.println("Победил крупье");
            return;
        }

        if(notBustPlayer.size() == 1){
            IPlayer winner = notBustPlayer.iterator().next();
            System.out.println("Победил игрок "+winner.getName());
            return;
        }

        int maxCountValues = getMaxCount(notBustPlayer);
        System.out.println("Победители:");
        for (IPlayer player : notBustPlayer) {
            if(player.countValues()==maxCountValues){
                System.out.println(player.getName());
                player.openCards();
            }

        }

    }

    private int getMaxCount(Set<IPlayer> winners){
        int maxCount = 0;
        for (IPlayer player : winners) {
            if(player.countValues()>maxCount){
                maxCount = player.countValues();
            }
        }
        return maxCount;
    }


    @Override
    public void addPlayerToGame(IPlayer player) {
        players.add(player);
    }
}
