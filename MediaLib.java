
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
   public static void main ()
   {
      System.out.println ("Welcome to your Media Library");
      Song song1 = new Song();
      System.out.println(song1);
      song1.setTitle("Johnny B. Goode");
      System.out.println(song1.getTitle());
      song1.setRating(3);
      System.out.println(song1.getRating());
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
      
   }
  
}
