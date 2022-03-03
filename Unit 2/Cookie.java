/** Name: Zain Siddiqui
* Teacher: Mr. Lee 
* Date: Mar 2 2022 
* Object: Cookie
* Description: creates a cookie class to be cookies  
*/
public class Cookie {
     /*
    Cookie Attributes:
    Contains 
    name
    weight of object
    calorie contains
     */

    /* the name of the cookie
    */
    private String name;

    /* the weight of the cookie
    */
    private double weight;

    /*
    the calories in the cookie
    */
    private int calories;
  
    /* 
    * cookie packaged? indicator
    */
    private boolean isPackaged;

    /*
    * Constructor - sets up the values
    * to become cookies
    */
  
    //sets up the default settings of the cookie (Unnamed)
	  public Cookie() {
		  this.name = " ";
		  this.weight = -1;
		  this.calories = -1;
		  this.isPackaged = false;
	}
    
	  public Cookie(String setName, double weight, int calories, boolean isPackaged) {
    /*
    * sets up cookies ( boolean must be included just for simplicity) 
    * @param = setName
    * @param = weight
    * @param = calories
    * @param = isPackaged
    */

      // this set into stone objects are immediately set into place with the variables given by the numbers.
		  this.name = setName;
        this.isPackaged = isPackaged;

      //in case of underweight objects it sets it to 0 to prevent issues
		  if(weight < 0) {
			    this.weight = 0;
	    } else {
			    this.weight = weight;
	  }

      //  same thing as above but in calories
      if(calories < 0) {
			    this.calories = 0;
		  } else {
			  this.calories = calories;
     }
    }
  
    /*
    * Methods
    * These methods are used for cookie repairs and modifications
    */

    //gets name of cookies
	  public String getName() {
	  return name;
     /*
     * getting the name of the cookie     
     * @return = name
     */
	  }

    
	  public double getWeight() {
	  return weight;
     /*
     * getting the weight of the cookie     
     * @return = weight
     */
	  }

    
	  public int getCalories() {
	  return calories;
     /*
     * Getting calories of the cookie
     * @return = calories
     */

	  }

    
	  public boolean getIsPackaged() {
	  return isPackaged;
     /*
     *checking if its still wrapped in the cookie wrap
     *@return = isPackaged
     */
	  }

    //used to open the bag to set cookie is unpackaged
    public void openCookieWrapper() {
		isPackaged = false;
	  }

    //used determine what exactly has been eaten and how much of it has been eaten
    public int eaten(double weight) {
    // checks for packaging, if packaged, return error code -2
		if(isPackaged == true) {
			return -2;
    // checks for weight is possible, if not, return error code -1
		} else if (weight > this.weight || this.weight == 0) {
			return -1;
		} else{
			double removedAmountPercentage = (weight / this.weight);
			double caloriesEaten = this.calories * removedAmountPercentage;
			this.calories = (int) (this.calories - caloriesEaten);
			this.weight = this.weight - weight;
			return calories;

		  }
    }
    // returning values for string variables:

      public String toString() {
	     String output = "Name: ";
    output = output + name + "\n" ;
    output = output + "Weight: "+ weight + "kg\n";
    output = output + "Calories: "+ calories + "%\n";
	    return output;
	}
}