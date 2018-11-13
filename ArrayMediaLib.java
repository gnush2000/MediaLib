
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
}
}