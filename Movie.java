
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;
    private double price;
    private String runtime;
    private int remainder;
    private int hours;

    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        duration = 0;
        price = 0;
        runtime = "";
        remainder = 0;
       
    }
    public String getTitle() {
        return title;
    }
    public void setTitle (String t) {
        title = t;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }
    public String getDuration() {
        remainder = duration % 60;
        hours = duration / 60;
        
        return "The runtime is " + hours + ":" + remainder;
    }
    public void setDuration(int d) {
        duration = d;
    }
    public Movie(String title, double price, int rating, int duration) {
      this.duration = duration;
      this.title = title;
      this.price = price;
      this.rating = rating;
    }
    
    
}
