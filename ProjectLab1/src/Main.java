import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Methods.GetInstance().GenerateCards();

        for (int i = 0; i < 52; i++) {
            System.out.println(Methods.DeckOfCards[i].GetCardType()+ " "+Methods.DeckOfCards[i].GetCardValue());

        }

    }
}
