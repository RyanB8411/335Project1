/**Rectangle Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a rectangle object that calculates
 * its area based off length and width using its parent class two dimensional
 * shape.
 */

public class Rectangle extends TwoDimensionalShape {//Extend our class
    //State our variables
    public double length;
    public double width;
    public double area;

    //Construct our object and also set its area inside the object
    public Rectangle(int numberOfDimensions, double length, double width) {
        super(numberOfDimensions, length, width);
        setArea(length, width);
    }
}