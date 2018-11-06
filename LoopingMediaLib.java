public class LoopingMediaLib
{
    public static void main()
    {
        System.out.println(MediaFile.readString());
        for(int i = 7; i > 0; i--)
        {
            System.out.println(i);
        }
}