import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
      String height2;
		double weight;

		System.out.print( " How old are you? " );
		age = keyboard.nextInt();

		System.out.print( " How tall are you in feet? " );
		height = keyboard.next();
      
      System.out.print( " How tall are you in inches? " );
		height2 = keyboard.next();

		System.out.print( " How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( " So you're " + age + " old, " + height + " feet tall "+ height2 + " inches tall "   +  weight + " pounds." );
	}
}