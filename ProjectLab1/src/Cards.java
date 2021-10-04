public class Cards
{
        //private String CardName;
        private int value;

        public enum CardTypes
        {
                Spade,
                Heart,
                Diamond,
                Club

        }
        private CardTypes cardType;

        // constructor
        public Cards(int value,CardTypes type)
        {
            //this.CardName = CardName;
            this.value = value;
            this.cardType = type;
        }

        // get / set
        //public void SetCardName (String name) {this.CardName= name; };
        public void SetCardValue(int value) {this.value = value; }
        public void SetCardType(CardTypes cardType) {this.cardType = cardType; }

        //public String GetCardName () {return this.CardName; };
        public int GetCardValue () {return this.value; }
        public CardTypes GetCardType(){return this.cardType;}
}
