public class LoopingMediaLib
{
    public static void main()
    {
       
       for(int i = 0; i < 10; i++)
        {
          
          System.out.println(MediaFile.readString());

        }
        MediaFile.saveAndClose();
        
       String songInfo = MediaFile.readString();
         
       while (songInfo != null)
       {
           System.out.println(songInfo);
         
       }
       
    }
}