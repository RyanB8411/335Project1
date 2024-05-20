/**Circle Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a Circle object that calculates
 * its area based off Pir^2 using its parent class two dimensional
 * shape.
 */

public class Circle extends TwoDimensionalShape {

    //Initialize variables
    private double radius;

    //Construct Circle Object and call super for number of dimensions and area
    Circle(int numberOfDimensions, double radius, double area){
        super(numberOfDimensions, (Math.PI * (radius * radius)));
        this.radius = radius;
    }
    //getters and setters for Circle class
    public void setRadius(double radius){
        this.radius = radius;
        super.setArea(Math.PI * (radius * radius));//update area as you update radius
    }
    public double getRadius(){
        return radius;
    }
}