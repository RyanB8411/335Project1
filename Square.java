/**Rectangle Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a square object that calculates
 * its area based off length squared using its parent class two dimensional
 * shape.
 */

 public class Square extends TwoDimensionalShape {//Extend our class
    //State our variables
    public double dimension1;
    public double area;

    //Construct our object and also set its area inside the object
    public Square(double dimension1) {
        super(dimension1, dimension1, area);
        setArea(dimension1, dimension1);
    }
}