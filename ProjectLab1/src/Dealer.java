public class Dealer {
    private Hand hand = new Hand();

    public boolean IsBlackjack() {
        if (hand.CalculateTotal() == 21)
            return true;
        else return false;
    }

    public void DealerPlay(DeckOfCards deck) {
        System.out.println();
        while (hand.CalculateTotal() <= 16) {
            System.out.println("Dealer has " + hand.CalculateTotal() + " and hits");
            hand.AddCard(deck.NextCard());
            System.out.println("Dealer " + this.GetHandString(true, false));
        }
        if (hand.CalculateTotal() > 21)
            System.out.println("Dealer busts. " + this.GetHandString(true, false));
        else
            System.out.println("Dealer stands. " + this.GetHandString(true, false));
    }

    public void AddCard(Card card) {
        hand.AddCard(card);
    }

    public String GetHandString(boolean isDealer, boolean hideHoleCard) {
        String str = "Cards:" + hand.ToString(isDealer, hideHoleCard);
        return str;
    }

    public void ClearHand() {
        hand.ClearHand();
    }

    public int GetTotal()
    {
        return hand.CalculateTotal();
    }


    public boolean Peek() {
        return hand.DealerPeek();
    }
}
