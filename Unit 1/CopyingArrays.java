import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class CopyingArrays

{
   public static void main( String[] args )
   {
   
      int [] myIntArray = new int [ 10 ];
   
      int [] b = new int[ myIntArray.length ];
   
      Random r = new Random();	
   
      int inv = myIntArray.length;
   
      for (int i = 0; i < myIntArray.length; i++)
      { 
         myIntArray[i] = r.nextInt(10);
      
      }
      for (int i = 0; i < b.length; i++)
      { 
         b[ i ] = myIntArray[ i ];
      }     
      myIntArray[ 9 ] = 9;
      for (int i = 0; i < myIntArray.length; i++)
      { 
         System.out.print(myIntArray[ i ]); // Printing first array without chaning the line
      
      }
      for (int i = 0; i < myIntArray.length; i++)
      { 
      
         System.out.println(b[ i ]);
      }
   }
}