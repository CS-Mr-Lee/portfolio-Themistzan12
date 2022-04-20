public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 40;
		int cats = 40;
		int dogs = 30;

		if ( people < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );//  what the if statement does is that it executes one set of code if a specified condition is met (TRUE) or another set of code evaluates to FALSE. 
         
		} else if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{ // You use curly braces when you group more than one statement in the if block.
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}

// 