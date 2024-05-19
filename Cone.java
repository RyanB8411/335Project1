/**Cone Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a Cone object that calculates
 * its area based off the radius and its height using its parent class three dimensional
 * shape.
 */

 //Extend our Three Dimensional Shape
 public class Cone extends ThreeDimensionalShape {
    private double radius;
    private double height;
    
    //Construct our cylinder
    Cone(int numberOfDimensions, double radius, double height, double volume){
        super(numberOfDimensions, (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height);;
        this.radius = radius;
    }
    //Set a new radius while updating its volume
    public void setRadius(double radius) {
        this.radius = radius;
        setVolume((1.0/3.0) * Math.PI * Math.pow(radius, 2) * height);
    }
    //Set a new height while updating its volume
    public void setHeight(double height) {
        this.height = height;
        setVolume((1.0/3.0) * Math.PI * Math.pow(radius, 2) * height);
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