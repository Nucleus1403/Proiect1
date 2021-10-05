public class Cards
{
        //private String CardName;
        private int value;
        private boolean IsTaken=false;

        public enum CardTypes
        {
                Spade,
                Heart,
                Diamond,
                Club

        }
        private CardTypes cardType;

        // constructor
        public Cards(int value,CardTypes type,boolean isTaken)
        {
            //this.CardName = CardName;
            this.value = value;
            this.cardType = type;
            this.IsTaken = isTaken;
        }

        // get / set
        //public void SetCardName (String name) {this.CardName= name; };
        public void SetCardValue(int value) {this.value = value; }
        public void SetCardType(CardTypes cardType) {this.cardType = cardType; }
        public void SetCardTaken(boolean taken) {this.IsTaken = taken; }

        //public String GetCardName () {return this.CardName; };
        public int GetCardValue () {return this.value; }
        public CardTypes GetCardType(){return this.cardType;}
        public boolean GetIsTaken(){return this.IsTaken;}
}
