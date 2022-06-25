/**
Name: Zain Siddiqui
Date: june 20
Description: Area Calculator*/

import java.util.Scanner;

public class AreaCalculator {

    public static double getAreaCircle(double radius) {
        return Math.PI * (radius * radius);
    }

    public static double getAreaRectangle(double l, double w) {
    
        double area = l * w;
        return area;
    }
    
    /**
    finds the srea of the triangle.
    @param base the base of the traingle
    @param height hieght of the triangler
    @return double the AArea of teriangle
    */
    public static double getAreaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double getAreaSquare(double length) {
        return length * length;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Shape Area Calculator\n");

        int choice = -1;
        while (choice != 5) {
            System.out.println("1) Square\n2) Rectangle\n3) Triangle\n4) Circle\n5) Quit");
            System.out.print("> ");
            choice = input.nextInt();
            System.out.println();
            if (choice == 1) {
                System.out.print("Length: ");
                double l = input.nextDouble();
                System.out.println("\nThe area is " + getAreaSquare(l) + ".\n");
            } else if (choice == 2) {
                System.out.print("Length: ");
                double length = input.nextDouble();
                System.out.print("Width: ");
                double width = input.nextDouble();
                System.out.println("\nThe area is " + getAreaRectangle(length, width) + ".\n");
                System.out.println(area);
            } else if (choice == 3) {
                System.out.print("Base: ");
                double base = input.nextDouble();
                System.out.print("Height: ");
                double height = input.nextDouble();
                System.out.println("\nThe area is " + getAreaTriangle(base, height) + ".\n");
            } else if (choice == 4) {
                System.out.print("Radius: ");
                double radius = input.nextDouble();
                System.out.println("\nThe area is " + getAreaCircle(radius) + ".\n");
            }
        }

    }

}