public class Main
{
    public static void main(String[] args)
    {
        Blackjack blackJack = Blackjack.GetInstance();

        blackJack.StartGame();
        do {
            blackJack.Shuffle();
            blackJack.DealCards();
            blackJack.PrintStatus();
            blackJack.CheckBlackjack();
            blackJack.HitOrStand();
            blackJack.DealerPlays();

        } while (blackJack.PlayAgain());
    }
}
