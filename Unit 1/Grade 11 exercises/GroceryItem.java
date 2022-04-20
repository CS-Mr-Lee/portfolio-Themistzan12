/** 
* Name: Zain Siddiqui
* Date: April 19
* Description: GroceryItem (formatted output,input)
*/
import java.util.Scanner;

public class GroceryItem {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    // Declaring variables
    double priceItem1;
    double priceItem2;
    String nameItem1;
    String nameItem2;

    System.out.println("Enter the items you want to buy and their prices");
    // Asking from user to enter the product and their prices and the amount they
    // are buying for stroing the values
    System.out.println("please enter the name of the first product");
    nameItem1 = in.nextLine();
    System.out.println("please enter the price of your first item");
    priceitem1 = in.nextDouble();
    in.nextLine();

    System.out.println("please enter the name of the second product");
    nameitem2 = in.nextLine();
    System.out.println("please enter the price of your second item");
    priceitem2 = in.nextDouble();
    in.nextLine();

    // Showing the prices for each product and total price
    System.out.println("Here is your reciept");
    System.out.println("Name                   Price");
    System.out.println("[------------------------------]");
    System.out.printf("%-20s  $%4.2f%n", nameitem1, priceitem1);
    System.out.printf("%-20s  $%4.2f%n", nameitem2, priceitem2);
    System.out.println("[------------------------------]");

  }
}