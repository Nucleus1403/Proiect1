import java.util.Scanner;

public class Blackjack {

    private Scanner sc = new Scanner(System.in);
    private static Blackjack blackjack = null;

    public DeckOfCards deck;

    private Player player = new Player();
    private Dealer dealer = new Dealer();
    private boolean GameOver = false;

    public static Blackjack GetInstance() {
        if (blackjack == null)
            blackjack = new Blackjack();
        return blackjack;

    }

    public void StartGame() {
        System.out.println("Welcome to Blackjack!");
        System.out.println("");
        System.out.println("  BlackJack RULES: ");
        System.out.println("	-The player is dealt 2 cards. The dealer is dealt 2 cards with one face-up and one face-down.");
        System.out.println("	-Cards are equal to their value with face cards being 10 and an Ace being 1 or 11.");
        System.out.println("	-The players cards are added up for their total.");
        System.out.println("	-Players “Hit” to gain another card from the deck. Players “Stay” to keep their current card total.");
        System.out.println("	-Dealer “Hits” until they equal or exceed 17.");
        System.out.println("	-The goal is to have a higher card total than the dealer without going over 21.");
        System.out.println("");
        System.out.println("");

        deck = new DeckOfCards();
    }

    public void Shuffle() {
        deck.Shuffle();
    }

    public void DealCards() {
        for (int j = 0; j < 2; j++) {
            player.AddCard(deck.NextCard());
            dealer.AddCard(deck.NextCard());
        }
    }

    public void CheckBlackjack() {
        if (dealer.IsBlackjack()) {
            System.out.println("Dealer has BlackJack!");
            GameOver = true;
            if (player.GetTotal() == 21) {
                System.out.println("Player pushes");
            } else {
                System.out.println("Player loses");
            }

        } else {
            if (dealer.Peek()) {
                System.out.println("Dealer peeks and does not have a BlackJack");
            }

            if (player.GetTotal() == 21) {
                GameOver = true;
                System.out.println("Player has blackjack!");
            }
        }
    }

    public void HitOrStand() {

        if (GameOver)
            return;

        String command;
        char c;

        System.out.println();

        do {
            do {
                System.out.print("Player (H)it or (S)tand? ");
                command = sc.next();
                c = command.toUpperCase().charAt(0);

            } while (!(c == 'H' || c == 'S'));

            if (c == 'H') {
                player.AddCard(deck.NextCard());
                if (player.GetTotal() == 21) {
                    System.out.println("Player has " + player.GetHandString());
                    System.out.println("Player won");
                    GameOver = true;
                } else if (player.GetTotal() > 21) {
                    GameOver = true;
                    System.out.println("Player has " + player.GetHandString());
                    System.out.println("Player loses");
                } else
                    System.out.println("Player has " + player.GetHandString());
            }

        } while (c != 'S' && player.GetTotal() <= 21);
    }

    public void DealerPlays() {

        if (GameOver)
            return;
        dealer.DealerPlay(deck);

        if(dealer.GetTotal()>21)
        {
            System.out.println("Player won");
        }else if(dealer.GetTotal()==21)
            {
                System.out.println("Player loses");
            }
        else
        {
            if(player.GetTotal()<21)
            {

                if(player.GetTotal()>dealer.GetTotal())
                {
                    System.out.println("Player won");
                }else if(player.GetTotal()==dealer.GetTotal())
                {
                    System.out.println("Player return");
                }else System.out.println("Player loses");

            }

        }
    }

    public void PrintStatus() {
        System.out.println("Player has " + player.GetHandString());
        System.out.println("Dealer has " + dealer.GetHandString(true, true));
    }

    public void ClearHands() {
        player.ClearHand();
        dealer.ClearHand();
    }

    public boolean PlayAgain() {
        ClearHands();
        String command;
        char value;
        boolean Continue = true;
        GameOver = false;

        do {
            System.out.println("");
            System.out.print("Do you want to play again (Y)es or (N)o? ");
            command = sc.next();
            value = command.toUpperCase().charAt(0);

        } while (!(value == 'Y' || value == 'N'));

        if (value == 'N') {
            Continue = false;
        }

        return Continue;
    }
}
