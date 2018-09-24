
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
   public static double totalCost;
   public static int numSongs;
   public static int totalRatings;

   public static void main ()
   {
      System.out.println ("Welcome to your Media Library");
      Song song1 = new Song();
      System.out.println(song1);
      song1.setTitle("Raise Your Glass");
      System.out.println(song1.getTitle());
      song1.setRating(3);
      System.out.println(song1.getRating());
      song1.setPrice(1.29);
      System.out.println("$" + song1.getPrice());
      Movie movie1 = new Movie();
      System.out.println(movie1);
      movie1.setTitle("Titanic");
      System.out.println(movie1.getTitle());
      movie1.setRating(8);
      System.out.println(movie1.getRating());
      Book book1 = new Book();
      System.out.println(book1);
      book1.setTitle("Red Pyramid");
      System.out.println(book1.getTitle());
      book1.setRating(6);
      System.out.println(book1.getRating());
      
      Song song2 = new Song("Cocaine Jesus", 0.99, 8);
      Song song3 = new Song("Moon", 1.29, 1);
      Song song4 = new Song("Big Green Tractor", 0.99, 2);
      Song song5 = new Song("Country Road", 0.99, 9);
      Song song6 = new Song("Build Me Up Buttercup", 0.99, 9);
      Song song7 = new Song("Silver Lining", 0.99, 8);
      
      System.out.println(song2.getSong());
      System.out.println(song3.getSong());
      System.out.println(song4.getSong());
      System.out.println(song5.getSong());
      System.out.println(song6.getSong());
      System.out.println(song7.getSong());
      
      System.out.println("Total cost: " + MediaLib.totalCost);
      System.out.println("Total songs: " + MediaLib.numSongs);
      System.out.println("Total Ratings: " + MediaLib.totalRatings);
      
      System.out.println("Average Cost: " + totalCost / numSongs);
      System.out.println("Average Rating: " + totalRatings / numSongs);
      
   }
   
}
