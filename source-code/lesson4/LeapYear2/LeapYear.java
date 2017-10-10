/**
 * Complete the setLeapYear method to properly detect leap years.
 */

public class LeapYear{

   private int year;
   private boolean isLeapYear;

   public LeapYear(int yr) {
       year = yr;
   }

   // write this
   // Sets isLeapYear to true if year is divisible by 4, unless it is 
   // also divisible by 100 and not divisible by 400. 
   // Otherwise isLeapYear is set to false.
   public void setLeapYear() {
      isLeapYear=((year%4==0&&!(year%100==0))||(year%400==0)); 
      System.out.println(isLeapYear);
   }
}