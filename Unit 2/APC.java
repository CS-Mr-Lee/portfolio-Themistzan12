/**
 * Name: Zain Siddiqui
 * Teacher: Mr Lee
 * Date: Mar 11 2022
 * Object: Human
 * Description: create a human class 3 attributes
 * and more 
 */

  //always needed to suppress annoying alerts of unused


  
// class for a Human object
public class APC {
    /*
    Tank Attributes:
    List of Contained Variables
    originCountry : String
    fuelEfficency : double
    brand : String
    fuelLeft : double
    price : double
    length: double
    width : double
    weapons :  String
    fuelCapacity: double
     */

     /* name of the vehicle
    */
    private String name;
  
    /* original country of maunfacture
    */
    private String originCountry;

    /* the fuel capacity of the vehicle
    */
    private double maximumFuelCapacity;

    /* the fuel efficency used to calculate how much fuel
    */
    private double fuelEfficency;

    /* the fuel remaining inside of the fuel tank of the vehicle
    */
    private double fuelLeft;

    /* the fuel capacity of the vehicle
    */
    private double fuelCapacity;

    /* the weapons used for the tank
    */
    private String weapons;

    /* the brand of the vehicle
    */
    private String brand;

    /* the price of the vehicle
    */
    private double price;

    /* the length of the vehicle
    */
    private double length;

    /* the length of the vehicle
    */
    private double width;

  /*
    * Constructor - sets up the values
    * to become vegtables
    */
  
    //sets up the default settings of the tank (Unnamed)
	  public APC() {
      //general info of the tank
      this.name = " ";
		this.originCountry = " ";
      this.weapons = " ";
      this.maximumFuelCapacity = -1;

      //fuel related statistics for vehicle purposes
      this.fuelLeft = -1;
      this.fuelEfficency = -1;
      this.fuelCapacity = -1;

      //market related statistics 
      this.brand = " ";
      this.price = -1;

      //dimension statistics
      this.length = -1;
      this.width = -1;
      

	}

    //this completely sets up the tank with every single attachment and parts together
	  public Tank(String name, String originCountry, String weapons, double maximumFuelCapacity, double fuelLeft, double fuelEfficency, double fuelCapacity, String brand, double price, double length, double width) throws Exception {

      // this sets all string variables together
		this.name = name;
      this.originCountry = originCountry;
      this.weapons = weapons;
      this.brand = brand;
      
      //in case of invalid parameters, it will immediately throw an exception
		  if((maximumFuelCapacity <= 0)) {
			    throw new Exception("Parameters Invalid");
        } else if((fuelEfficency <= 0)){
			    throw new Exception("Parameters Invalid");
        }  else if((price <= 0)){
			    throw new Exception("Parameters Invalid");
        } else if((length <= 0)){
			    throw new Exception("Parameters Invalid");
        } else if((width <= 0)){
			    throw new Exception("Parameters Invalid");
	    } else {
			 this.maximumFuelCapacity = maximumFuelCapacity;
        this.fuelLeft = fuelLeft;
        this.fuelEfficency = fuelEfficency;
        this.fuelCapacity = fuelCapacity;
        this.price = price;
        this.length = length; 
        this.width = width;
	  }
    }

  /*
    Methods
    The the parts of the tank that move and does something.
    */

      //refueling the tank (will not work if tank is filled)
      public void refuel(double refuel) throws Exception{
        if (refuel <= 0){
          throw new Exception("Negative refuel");
          } else{
          this.fuelCapacity = refuel + fuelLeft;
        if (fuelCapacity > maximumFuelCapacity){
        System.out.println(name + "'s tank' is already full");
        } else {
          System.out.println(name + " was refueled with " + refuel + "L of gasoline.");
          this.fuelLeft = fuelCapacity;
        }
        }
      }

  //check what weapons are on the tank (doesn't do anything else)
  public void checkWeapons(){
      System.out.println(name + " has " + weapons + ". They look brand new.");
  }

    //driving the tank 
    public void drive(double distance){
      double maximumDistanceAble = fuelLeft * fuelEfficency;
      this.fuelLeft = fuelLeft - (distance / fuelEfficency);
      if ((distance <= 0) || (fuelLeft == 0)){
        System.out.println(name + " did not move.");
      } else if ((distance > maximumDistanceAble)){
        this.fuelLeft = 0;
        System.out.println(name + " attempted to travel for " + distance + "km but only was able to travel for " + maximumDistanceAble + "km before running out of fuel.");
        System.out.println("Remember to refuel before making such trip, lad. - Laur J'Koughk");
      } else {
        System.out.println(name + " travelled for " + distance);
        System.out.println(name + " has " + fuelLeft + "L of fuel left");


        
      }
    }

  //changes the weapons of the Tank
  public void changeWeaponTo(String newWeapons){
    String oldWeapons = weapons;
    this.weapons = newWeapons
      System.out.println(oldWeapons + " was changed for " + weapons);
  }

  //tells price sold for tank
  public void sell(){
  System.out.println(name + "would be sold for $" + price);
  }  

  // Method to print out information details
    public String toString() {
    String output = "Name of Tank: ";
    output = output + name + "\n" ;
    output = output + "Brand: "+ brand + "kg\n";
    output = output + "Country of Origin: "+ originCountry + "kg\n";
    output = output + "Price: "+ price + "kg\n";
    output = output + "Weapons on Tank: "+ weapons + "kg\n";
    output = output + "Weapons on Tank: "+ weapons + "kg\n";  
    output = output + "Price: "+ price + "kg\n";
    output = output + "Dimensions: " + length + "m by" + width + "m\n";
    output = output + "Fuel left: "+ fuelLeft + "/" + maximumFuelCapacity + "%\n";
  }
}
