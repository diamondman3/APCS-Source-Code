//
// Note: This code is not good style
//
   public class Name {

   private String myFirst;
   private String myMiddle;
   private String myLast;
   
   public Name (String first, String middle, String last) {
      myFirst = fixCase(first);
      myMiddle = fixCase(middle);
      myLast = fixCase(last);
   }
   
   public String lastFirst ( ) {
      return myLast + ", " + myFirst + " " + myMiddle;
   }
   
   public String fullName ( ) {
      return myFirst + " " + myMiddle + " " + myLast;
   }
   
   private String fixCase (String namePart) {
       namePart=namePart.toLowerCase().trim();
       namePart=namePart.substring(0,1).toUpperCase() + namePart.substring(1);
       return namePart;
   }
   
   public String initials() {
       return myFirst.substring(0,1)+myMiddle.substring(0,1)+myLast.substring(0,1)+"";
   }
}