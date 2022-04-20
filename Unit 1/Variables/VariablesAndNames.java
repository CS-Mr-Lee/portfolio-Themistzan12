/*
 * Name: Zain Siddiqui
 * Date : Feb 16 2022
 * File Name: VariablesAndNames
 *
 */
public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven; // Declaring integer values
        double space_in_a_car, carpool_capacity, average_passengers_per_car; // Declaring double values

        cars = 100; //Initializing the variable with a number
        space_in_a_car = 4; // String a decimal value
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers; // Doing a Subtraction calculation by using the Integer varibles declared
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car; // Doing a multiplication calculation by using the Integer varibles declared
 
        average_passengers_per_car = passengers / cars_driven; // Doing a Devision calculation by using the Integer varibles declared
 


        System.out.println( "There are " + cars + " cars available." ); // Printing the values 
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}



