import java.util.Scanner;

public class CountingFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        
        System.out.print( Mr. Mitchell is cool. );
        

        for ( int n = 1 ; n <= 10 ; n = n+1 )
        {
            System.out.println( n + ". " + Mr. Mitchell is cool. );
        }

    }
}

// n = n+1 prevents it from printing the message continiously.