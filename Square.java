/**Square Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a square object that calculates
 * its area based off side squared using its parent class two dimensional
 * shape.
 */

 public class Square extends TwoDimensionalShape {//Extend our class
    //State our variable
    private double side;

    //Construct our object and also set its area inside the object
    public Square(int numberOfDimensions, double side, double area) {
        super(numberOfDimensions, side * side);
        this.side = side;
    }
    //Getters and Setters for the side
    public void setSide(double side){
        this.side = side;
        super.setArea(side * side);
    }
    public double getSide(){
        return side;
    }
}