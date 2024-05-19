/**Sphere Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a Sphere object that calculates
 * its area based off the radius using its parent class three dimensional
 * shape.
 */

 //Extend our Three Dimensional Shape
public class Sphere extends ThreeDimensionalShape {
    private double radius;
    
    //Construct our sphere
    Sphere(int numberOfDimensions, double radius, double volume){
        super(numberOfDimensions, (4.0/3.0)*Math.PI*Math.pow(radius, 3));;
        this.radius = radius;
    }
    //Set a new radius while updating its volume
    public void setRadius(double radius) {
        this.radius = radius;
        setVolume((4.0/3.0)*Math.PI*Math.pow(radius, 3));
    }
    //Return the radius
    public double getRadius() {
        return radius;
    }

}