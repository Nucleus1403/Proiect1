import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class Methods
{
    private static Methods methods = null;
    public static Cards[] DeckOfCards= new Cards[52];
    private static Random rnd = new Random();

    private Methods()
    {

    }

    public static Methods GetInstance()
    {
        if (methods == null)
            methods = new Methods();
        return methods;

    }
    public static void GenerateCards()
    {
        Cards[] CardsDeck= new Cards[52];
        GenerateSetOfCards(CardsDeck,0,13, Cards.CardTypes.Diamond);
        GenerateSetOfCards(CardsDeck,13,26, Cards.CardTypes.Spade);
        GenerateSetOfCards(CardsDeck,26,39, Cards.CardTypes.Club);
        GenerateSetOfCards(CardsDeck,39,52, Cards.CardTypes.Heart);
        DeckOfCards = CardsDeck;
    }
    public static void GenerateSetOfCards(Cards CardsDeck[],int start ,int end,Cards.CardTypes cardType)
    {
        for (int i = start; i < end; i++)
        {
            CardsDeck[i]=new Cards(i, cardType,false);
        }
    }

    public static Cards PullCard()
    {

        int a = rnd.nextInt(DeckOfCards.length-1);
        Cards card = DeckOfCards[a];
        if(DeckOfCards[a].GetIsTaken())
        {
            if(a>25)
            {
                for (int i = 0; i < 25; i++) {
                    if(DeckOfCards[i].GetIsTaken()==false)
                    {
                        card= DeckOfCards[i];
                        DeckOfCards[i].SetCardTaken(true);
                    }
                }
            }else
            {
                for (int i = 26; i < 51; i++) {
                    if(DeckOfCards[i].GetIsTaken()==false)
                    {
                        card= DeckOfCards[i];
                        DeckOfCards[i].SetCardTaken(true);
                    }
                }
            }
        }
        else
            DeckOfCards[a].SetCardTaken(true);

        return card;
    }


}
