import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileInput{
    
    public static void main(String[] args)
    {
       
        
        String fileName = "name.txt";
        
        String myline = null;
        try
        {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            
            System.out.println("\n----The content of File----");
            myline = br.readLine();
            while(myline != null)
            {
                System.out.println(myline);
                myline = br.readLine();
            }
            br.close();
        }
        catch(IOException ex)
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +ex);
        }
    }
}