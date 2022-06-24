
/** 
* Name: Zain Siddiqui
* Date: June 24,2022
* Description: SASTriangleSolver(methods, math)
*/
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class SASTriangleSolver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // We Declre the variables here
        
        double sideA;
        double sideB;
        double sideC;
        double angleA;
        double angleB;
        double angleC;
        double result;
        int AllDegrees = 180;

       
        
        // This will ask the user to enter both sides (a) and (b) and including the anlge in the middle (c).
        System.out.println("Enter the Side (a)");
        sideA = in.nextDouble();
        in.nextLine();
        System.out.println("Enter the Side (b)");
        sideB = in.nextDouble();
        in.nextLine();
        System.out.println("Enter angle in radians between the first and second side (C)");
        angleC = in.nextDouble();
        in.nextLine();
        
        
        // This will be converting the radians to degrees.
        angleC = Math.toDegrees(angleC); 

       
        // calculating side (c)
        sideC = sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(angleC));

             
        // To calculating angle (A).
        angleA = Math.acos((Math.pow(sideC, 2) + Math.pow(sideB, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC));
        angleA = Math.toDegrees(angleA);

        angleB = AllDegrees - (angleA + angleC); // calculating angleB by using other angles (A + B + C = 180) 

        result = smallestAngle(angleA, angleB, angleC);
        System.out.println(result);

    }

    
    /**
     * This will find the smallest angle in the tringle.
     * @param angleA - angle that had been calculated based on sides
     * @param angleB - angle that had been calculated based angles
     * @param angleC - angle that had been calculated based on sides
     * @return > smallest angle
     */
    
       public static double smallestAngle(double angleA, double angleB, double angleC) 
    {
        double smallest;

            if (angleA <= angleB && angleA <= angleC) 
            {
               smallest = angleA;
            } 
            else if (angleB <= angleC && angleB <= angleA) 
            {
               smallest = angleB;
            } 
            else 
            {
               smallest = angleC;
         }

            return smallest;

       }
       

}