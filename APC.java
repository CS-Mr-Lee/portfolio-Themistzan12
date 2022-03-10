/**
Name: Zain Siddiqui
Date: Mar 7
Description: A APC class
*/

public class APC {
   private String originCountry ;
   private double fuelEfficency ;
   private String brand;
   private double fuelLeft;
   private double price;
   private double length;
   private double width;
   private String wheelStatus;
   private double fuelCapacity;
   private String name;
    
   
   /*
   Constructor
   */
   public APC(String brand, String originCountry, String wheelStatus, String name) {
      this.brand = brand;
      this.originCountry = originCountry;
      this.wheelStatus = wheelStatus;  
      this.name = name;
   }
   
   public APC(String brand, String colour, int numPassengers) {
      this.brand = brand;
      this.originCountry = originCountry;
      this.wheelStatus = wheelStatus;  
      this.name = name;
   }
   
   /*Accessors and Mutators*/
   public String getBrand() { return this.brand;}
   public String getoriginCountry() { return this.originCountry;}
   public String getwheelStatus() { return this.wheelStatus;}
   public double getprice() { return this.price;}
   public String getDirection() {return "" + this.direction;}
   
   
   public void setSpeed(double newprice) {
      this.price = newprice;
   }
   public void setfuelEfficency(double newfuelEfficency) {
      this.fuelEfficency = newfuelEfficency;
   }
    public void setlength(double newlength) {
      thislength = newlength;
   }
    public void setwidth(double newwidth) {
      this.width = newwidth;
   }
    public void setfuelCapacity(double newfuelCapacity) {
      this.fuelCapacity = newfuelCapacity;
   }
   
  
   /* Other Methods */
   public void accelerate(double accel, double time) {
      this.speed += accel * time;
   }
   
   public void stop() {
      this.speed = 0;
   }
   
   /**
   adds a passenger to the car if it is not moving
   @return whether it is successful in adding a passenger
   */
   public boolean addPassenger() {
      if (speed == 0) {
         this.numPassengers++;
         return true;
      } else {
         System.out.println("Cannot add passenger");
         return false;
      }
   }
   
   public void honk() {
      System.out.println("The car HONKs!");
   }
   
   public String toString() {
      return "Brand: " + this.brand + "; Colour: " + this.colour + "; Passengers: " + this.numPassengers + 
             "; Speed: " + this.speed + "; Direction: " + this.direction;
   }
}