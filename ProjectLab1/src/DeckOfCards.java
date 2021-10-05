import java.util.Random;

public class DeckOfCards {
    public int Index;
    Card[] deck = new Card[52];

    public DeckOfCards() {
        int count = 0;

        for (int i = 1; i <= 13; i++) {
            deck[count++] = new Card('H', i);
        }
        for (int i = 1; i <= 13; i++) {
            deck[count++] = new Card('S', i);
        }
        for (int i = 1; i <= 13; i++) {
            deck[count++] = new Card('C', i);
        }
        for (int i = 1; i <= 13; i++) {
            deck[count++] = new Card('D', i);
        }
        Index = 0;
    }

    private void SwapCards(int index1, int index2) {
        Card aux;
        aux = deck[index1];
        deck[index1] = deck[index2];
        deck[index2] = aux;
    }

    public void Shuffle() {
        Random rn = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < deck.length; j++) {
                SwapCards(i, rn.nextInt(52));
            }
        }
        Index = 0;
    }

    public Card NextCard() {
        return deck[Index++];
    }

}
