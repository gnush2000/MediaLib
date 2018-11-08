public class LoopingMediaLib
{
    public static void main()
    {
        for(int i = MediaLib.numSongs; i > 0; i--)
        {
            String songInfo = MediaFile.readString();
            System.out.println(songInfo);
        }
    }
}