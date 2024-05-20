/**Two Dimensional Object Class
 * 18May2024
 * Ryan Burkhardt
 * This class will extend the shape class and add area to be calculated in the
 * constructor.
 */

 //Extend the class
public class TwoDimensionalShape extends Shape {
    public double area;

    //Construct the two dimensional object with area
    public TwoDimensionalShape(int numberOfDimensions, double area) {
        super(2);
        this.area = area;
    }
    //set the area of the object
    public void setArea(double area) {
        this.area = area;
    }
    //get the area of the object
    public double getArea() {
        return Math.round(area*100)/100.0;
    }
}