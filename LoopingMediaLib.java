public class LoopingMediaLib
{
    public static void main()
    {
       for(int i = MediaLib.numSongs; i > 0; i--)
        {
            System.out.println(MediaFile.readString());

        }
       while (songInfo!= null)
       {
           System.out.println(MediaFile.readString());
       }
       
    }
}