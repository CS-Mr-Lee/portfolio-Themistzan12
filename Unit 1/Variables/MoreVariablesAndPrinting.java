/*
 * Name: Zain Siddiqui
 * Date : Feb 16 2022
 * File Name: MoreVariablesAndPrinting
 *
 */public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String name, Eyes, Teeth, Hair;
        int Age;
        double Height;
        double Weight;  

        name = "Zed A. Shaw";
        Age = 35;     // not a lie
        Height = 74 * 2.54;  // cm
        Weight = 180/ 2.2046; // kg
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println( "Let's talk about " + name + "." );
        System.out.println( "He's " + Height + " cm tall." );
        System.out.println( "He's " + Weight + " kg. heavy" );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
            + " I get " + (Age + Height + Weight) + "." );
    }
}