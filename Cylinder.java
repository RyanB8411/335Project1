/**Cylinder Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a Cylinder object that calculates
 * its area based off the radius and its height using its parent class three dimensional
 * shape.
 */

 //Extend our Three Dimensional Shape
 public class Cylinder extends ThreeDimensionalShape {
    private double radius;
    private double height;
    
    //Construct our cylinder
    Cylinder(int numberOfDimensions, double radius, double height, double volume){
        super(numberOfDimensions, Math.PI * Math.pow(radius, 2) * height);;
        this.radius = radius;
    }
    //Set a new radius while updating its volume
    public void setRadius(double radius) {
        this.radius = radius;
        setVolume(Math.PI * Math.pow(radius, 2) * height);
    }
    //Set a new height while updating its volume
    public void setHeight(double height) {
        this.height = height;
        setVolume(Math.PI * Math.pow(radius, 2) * height);
    }
    //Return the radius
    public double getRadius() {
        return radius;
    }
    //Return the height
    public double getHeight() {
        return height;
    }
}