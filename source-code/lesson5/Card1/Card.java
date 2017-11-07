/** Card:  a class that models a playing card, 
 *    e.g., an ace of spades or a seven of diamonds.
 *    
 *    You need to complete the isLegalRank and isLegalSuit methods.
 */

public class Card {
   
   // the cards suit: either 0 (clubs), 1 (diamonds), 2 (hearts), or 3 (spades)
   private int s;
   //myRank, a value between 2 and 14, inclusive
   // 11 represents a jack, 12 a queen, 13 a king, and 14 an ace (which is high).
   private int r;
   
   // the constructor
   public Card (int rank, int suit) {
      if (isLegalRank (rank)) {
         r = rank;
      } else {
         System.out.println ("Illegal rank: " + r);
      }
      if (isLegalSuit (suit)) {
         s = suit;
      } else {
         System.out.println ("Illegal suit: " + s);
      }
   }
   
   public boolean outRanks(Card other) {
       return (r>other.getRank()||(r==other.getRank()&&s>other.getSuit()));
   }
   
   // returns 'true' if the rank of this card is legal, or false otherwise.
   public boolean isLegalRank (int x) {
      return x >= 2 && x <= 14;
   }
   
   // returns 'true' if the suit of this card is legal, or false otherwise.
   public boolean isLegalSuit (int x) {
      // you fill this in
        return x >= 0 && x <= 3;
   }
   
   public int getRank ( ) {
      return r;
   }
   
   public int getSuit ( ) {
      return s;
   }
   
}