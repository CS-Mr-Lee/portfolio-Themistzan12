public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		if ( cars < people )// We use else to specify a block of code to be executed, if the same condition is false, We Use else if to specify a new condition run, if the first condition is false.
		{
			System.out.println( "We should not take the cars." ); // When the else statement was removed from the else if I noticed that the if statement jumped to the else statement directly ignoring the if in the middle.This does not work because the if statement responds to else if or else statements because that is the outcome after the condition that is met by the if statement.
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}