public class Card {
    private char suit;
    private int value;

    public Card(char newSuit, int newValue) {
        this.value = newValue;
        this.suit = newSuit;

    }

    public String ToString() {

        return GetSuitName() + "-" + this.value;

    }

    public String GetSuitName() {

        String suit;

        if (this.suit == 'H') {

            suit = "Hearts";

        } else if (this.suit == 'S') {

            suit = "Spades";

        } else if (this.suit == 'C') {

            suit = "Clubs";

        } else if (this.suit == 'D') {

            suit = "Diamonds";

        } else {

            suit = "Unknown";
        }

        return suit;

    }

    public char GetSuitDesignator() {
        return suit;
    }

    public String GetValueName() {

        String name = "Unknown";

        if (this.value == 1) {
            name = "Ace";
        } else if (this.value == 2) {
            name = "Two";
        } else if (this.value == 3) {
            name = "Three";
        } else if (this.value == 4) {
            name = "Four";
        } else if (this.value == 5) {
            name = "Five";
        } else if (this.value == 6) {
            name = "Six";
        } else if (this.value == 7) {
            name = "Seven";
        } else if (this.value == 8) {
            name = "Eight";
        } else if (this.value == 9) {

            name = "Nine";
        } else if (this.value == 10) {

            name = "Ten";
        } else if (this.value == 11) {

            name = "Jack";
        } else if (this.value == 12) {

            name = "Queen";
        } else if (this.value == 13) {

            name = "King";

        }
        return name;

    }

    public int GetValue() {
        return this.value;
    }

}
