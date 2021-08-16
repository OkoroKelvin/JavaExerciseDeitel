package semicolon.chapter7;
/*
The problem is to create a program that will randomly select four cards from a deck
of cards
 */

public class DeckOfCards {
    public static void main(String[] args) {
        /*
        for (int i = myList.length – 1; i > 0; i––) {
// Generate an index j randomly with 0 <= j <= i
int j = (int)(Math.random()
* (i + 1));
// Swap myList[i] with myList[j]
double temp = myList[i];
myList[i] = myList[j];
myList[j] = temp;
         */
        int [] deck = new int [52];
        String [] suits ={"Spades", "Hearts", "Diamonds", "Clubs"};
        String [] ranks = {"Ace","2","3","4", "5", "6", "7", "8", "9",
                "6 ","10", "Jack", "Queen", "King"};
        for(int i = 0; i <deck.length;i++){
            deck[i] = i;
        }
        for (int i=0; i<deck.length;i++){
            int index = (int)(Math.random()*deck.length);
            int temp = deck[i];
            deck[i]=deck[index];
            deck[index] = temp;
        }
    }
}
