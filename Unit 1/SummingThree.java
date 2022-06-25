import java.io.File;
import java.io.IOException;
import java.util.*;
    
public class SummingThree {
        
   public static void main( String[] args )  {
            
            
      int number1 = 0;
      int number2 = 0;
      int number3 = 0;
      int sum;
      
      try{
         Scanner numbers = new Scanner(new File("3nums.txt"));
         number1 = numbers.nextInt();
         number2 = numbers.nextInt();
         number3 = numbers.nextInt();
            
         numbers.close();
      
      } catch(IOException e) {
            System.out.println("cannaot open file");
      }
      sum = number1 + number2 + number3;
      System.out.println( "Reading numbers from file \"3nums.txt\". . done." );
      System.out.println( number1 + " + " + number2 + " + " + number3 + " = " + sum );
           
            
   }
}
