public class Player
{
    private Hand hand;

    public Player()
    {
        hand = new Hand();
    }

    public int GetTotal()
    {
        return hand.CalculateTotal();
    }

    public void AddCard(Card card)
    {
        hand.AddCard(card);

    }

    public String GetHandString() {
        String str = "Cards:" + hand.ToString();

        return str;
    }

    public void ClearHand()
    {
        hand.ClearHand();
    }


}
