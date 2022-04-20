import java.util.Scanner;

public class Ten Times
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in Mr. Mitchell is cool." );
        System.out.print( "Message: " );
        

        for ( int n = 1 ; n <= 10 ; n = n+1 )
        {
            System.out.println( n + ". " + message );
        }

    }
}

// n = n+1 prevents it from printing the message continiously.