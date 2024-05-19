/**Rectangle Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a rectangle object that calculates
 * its area based off length and width using its parent class two dimensional
 * shape.
 */

public class Rectangle extends TwoDimensionalShape {//Extend our class
    //State our variables
    private double length;
    private double width;

    //Construct our object and also set its area inside the object
    public Rectangle(int numberOfDimensions, double length, double width, double area) {
        super(numberOfDimensions, length*width);
        this.length = length;
        this.width = width;
    }
    //Setters and Getters for the Rectangle class to include setting 
    //the area every time the length or width is updated
    public void setLength(double length){
        this.length = length;
        super.setArea(length * width);
    }
    public void setWidth(double width){
        this.width = width;
        super.setArea(length * width);
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
}