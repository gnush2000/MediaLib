
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private double price;
    private String title;
    private boolean favorite;
<<<<<<< HEAD
    private int numSongs;
    private double totalCost;
=======
>>>>>>> 5e3a0c5d5c255792bd95b5542767e03a229dfb62
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
        MediaLib.totalCost = 0.00;
        MediaLib.numSongs = 0;
    }

  public String getTitle() {
      return title;
    }
  public void setTitle(String t) {
      title = t;
    }
  public int getRating() {
      return rating;
    }
  public void setRating(int r) {
      rating = r;
    }
  public double getPrice() {
      return price;
    }
  public void setPrice(double p) {
      price = p;
    }
  public void addToFavorites() {
      favorite = true;
    }
  public Song(String title, double price, int rating) {
      this.title = title;
      this.price = price;
      this.rating = rating;
      MediaLib.totalCost = MediaLib.totalCost + price;
      MediaLib.numSongs = MediaLib.numSongs + 1;
      MediaLib.totalRatings = MediaLib.totalRatings + rating;
    }
  
  public String getSong() {
     return "Title: " + title + ", Price: " + price + ", Rating: " + rating;
    }
}
