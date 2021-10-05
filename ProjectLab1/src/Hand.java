public class Hand {
    private Card[] theHand = new Card[12];

    private int numberOfCards = 0;

    public int CalculateTotal() {
        int total = 0;
        boolean aceFlag = false;
        for (int i = 0; i < numberOfCards; i++) {
            int value = theHand[i].GetValue();
            if (value > 10) {
                value = 10;
            } else if (value == 1) {
                aceFlag = true;
            }
            total += value;
        }
        if (aceFlag && total + 10 <= 21) {
            total += 10;
        }
        return total;
    }

    public String ToString() {
        return this.ToString(false, false);
    }

    public String ToString(boolean isDealer, boolean hideHoleCard) {
        String str = "";
        int total = 0;
        boolean aceFlag = false;
        String aceString = "";
        for (int i = 0; i < numberOfCards; i++) {
            if (isDealer && hideHoleCard && i == 0) {
                str = " Showing";
            } else {
                int value = theHand[i].GetValue();
                String valueName;
                if (value > 10) {
                    valueName = theHand[i].GetValueName();
                } else if (value == 1) {
                    valueName = "A";
                } else {
                    valueName = Integer.toString(value);
                }
                str += " " + valueName + theHand[i].GetSuitDesignator();
                if (value > 10) {
                    value = 10;
                } else if (value == 1) {
                    aceFlag = true;
                }
                total += value;
            }
        }
        if (aceFlag && total + 10 <= 21) {
            aceString = " or " + (total + 10);
        }
        if (hideHoleCard) {
            return str;
        } else {
            return str + " totals " + total + aceString;
        }

    }

    public void AddCard(Card card) {
        theHand[numberOfCards++] = card;
    }

    public void ClearHand() {
        numberOfCards = 0;
    }

    public boolean DealerPeek() {
        int value = theHand[1].GetValue();
        return value == 1 || value >= 10;
    }
}
