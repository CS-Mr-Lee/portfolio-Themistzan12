/**
Name: Zain Siddiqui
Date: june 20
Description: Month name*/
public class MonthName
{
    public static String monthName( int month )
    {
        String result;
        // Your code goes in here.
        if (month == 1) {
            result = "January";
        } else if (month == 2) {
            result = "February";
        } else if (month == 3) {
            result = "March";
        } else if (month == 4) {
            result = "April";
        } else if (month == 5) {
            result = "May";
        } else if (month == 6) {
            result = "June";
        } else if (month == 7) {
            result = "July";
        } else if (month == 8) {
            result = "August";
        } else if (month == 9) {
            result = "September";
        } else if (month == 10) {
            result = "October";
        } else if (month == 11) {
            result = "November";
        } else if (month == 12) {
            result = "December";
        } else {
            result = "error";
        }
        return result;
    }


    public static void main( String[] args )
    {
        System.out.println( "Month 1: " + monthName(1) );
        System.out.println( "Month 2: " + monthName(2) );
        System.out.println( "Month 3: " + monthName(3) );
        System.out.println( "Month 4: " + monthName(4) );
        System.out.println( "Month 5: " + monthName(5) );
        System.out.println( "Month 6: " + monthName(6) );
        System.out.println( "Month 7: " + monthName(7) );
        System.out.println( "Month 8: " + monthName(8) );
        System.out.println( "Month 9: " + monthName(9) );
        System.out.println( "Month 10: " + monthName(10) );
        System.out.println( "Month 11: " + monthName(11) );
        System.out.println( "Month 12: " + monthName(12) );
        System.out.println( "Month 43: " + monthName(43) );
    }
}