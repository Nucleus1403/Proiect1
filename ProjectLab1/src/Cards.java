public class Cards
{
        private String CardName;
        private int value;


        // constructor
        public Cards(String CardName, int value) {
            this.CardName = CardName;
            this.value = value;

        }

        // get / set
        public void SetCardName (String name) {this.CardName= name; };
        public void SetCardValue() {this.value = value; };

        public String GetCardName () {return this.CardName; };
        public int GetCardValue () {return this.value; };
}
