/** Name: Zain Siddiqui
* Teacher: Mr. Lee 
* Date: Mar 2 2022 
* Object: Cookie
* Description: creates a vegetable class to be vegetable  
*/
public class Vegetable {
    /*
    vegetable Attributes:
    Contains 
    name
    weight of object
    how much calories it contains
    */

    /* the name of the vegetable
    */
    private String name;

    /* the weight of the vegetable
    */
    private double weight;

    /*
    the calories in the vegetable
    */
    private int calories;

    /*
    * Constructor - sets up the values
    * to become vegetables
    */
  
    //sets up the default settings of the vegetable (Unnamed)
	  public Vegetable() {
		  this.name = " ";
		  this.weight = -1;
		  this.calories = -1;
		  
	}
    
	  public Vegetable(String setName, double weight, int calories) {
    
    /*
    * sets up cookies ( boolean must be included just for simplicity) 
    * @param = setName
    * @param = weight
    * @param = calories
    */

      // this set into stone objects are immediately set into place with the variables given by the numbers.
		this.name = setName;
     

      //in the case of underweight objects it sets it to 0 to prevent any issues
		  if(weight < 0) {
			    this.weight = 0;
	    } else {
			    this.weight = weight;
	  }

      //in the case of too less calories objects it sets it to 0 to prevent any issues
      if(calories < 0) {
			    this.calories = 0;
		  } 
        else {
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
     * getting the name of the vegetable     
     * @return = name
     */
	  }

    //gets the weight of the cookies
	  public double getWeight() {
	  return weight;
     /*
     * getting the weight of the vegetable    
     * @return = weight
     */
	  }

    
	  public int getCalories() {
	  return calories;
     /*
     * Getting calories of the vegetable
     * @return = calories
     */

	  }

    //used determine what exactly has been eaten and how much of it has been eaten
    public int eaten(double weight) {
   
    // checks for weight is possible, if not, return error code -1
		  
      if (weight > this.weight || this.weight == 0) {
		   return -1;
		} 
      else
      {
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