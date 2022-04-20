import java.util.Scanner;

public class AgeIn5
{
  public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        double salary;
        System.out.println("Hello. What is your name?");
        
        name = keyboard.next();
        System.out.println();
        
        System.out.println("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();
        System.out.println();
        
        System.out.println("So you would be " + (age + 5) + " after 5 years");
        System.out.println("and did you know you were " + (age -5)  + " five years ago");
        
        }	
   
}
   
   
   
   
   
 
