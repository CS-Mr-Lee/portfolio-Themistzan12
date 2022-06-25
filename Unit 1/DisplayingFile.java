import java.util.Scanner;
import java.io.*;

import java.util.Scanner;
import java.io.*;

public class DisplayingFile
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the Name of File: ");
        String fileName = scan.nextLine();
        
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