public class LoopingMediaLib
{
    public static void main()
    {
        System.out.println(MediaFile.readString());
        for(int i = MediaLib.numSongs; i > 0; i--)
        {
            //System.out.println(("song" + i).getTitle() + "|" + ("song" + i).getRating() + "|" + ("song" + i).getPrice());
            //MediaFile.writeString(("song" + i).getTitle() + "|" + ("song" + i).getRating() + "|" + ("song" + i).getPrice());
        }
    }
}