
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
   private static double total;
   public static void main() {
   
   String [] sharingFriends = {"Anne", "Beth", "Edward", "John", "Sophia", "Smudge"};
   int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
   for (int i = 0; i < sharingFriends.length; i++)
   {
       System.out.println(sharingFriends[i]);
   }
   for (int i = 0; i < daysBtwnPurchase.length; i++)
   {
       total = total + daysBtwnPurchase[i];
   }
   System.out.println(total + " days");
   System.out.println(total / daysBtwnPurchase.length + " avarage days");
   
   //Songs
    Song [] topTenSongs = {new Song("The Twist"),
                          new Song("Smooth"),
                          new Song("Mack The Knife"),
                          new Song("How Do I Live"),
                          new Song("Party Rock Anthem"),
                          new Song("I Gotta Feeling"),
                          new Song("Macarena (Bayside Boys Mix)"),
                          new Song("Physical"),
                          new Song("You Light Up My Life"),
                          new Song("Hey Jude")};
                          
   
   for (Song s: topTenSongs)
   {
       System.out.println(s.getTitle());
   }
   // change the array
   System.out.println("-BEFORE--");
   for (Song changeSong : topTenSongs) {
       //changeSong.setTitle("test");
       //changeSong = new Song("test");
       //System.out.println(changeSong.getTitle());
    }
    // show the array
    System.out.println("-AFTER--");
   for (Song showSong : topTenSongs) {
       System.out.println(showSong.getTitle());
       
   }
  
}
}