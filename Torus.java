/**Torus Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a Torus object that calculates
 * its volume based off the radius and its starting edge from the
 * center using its parent class three dimensional
 * shape.
 */

 //Extend our Three Dimensional Shape
 public class Torus extends ThreeDimensionalShape {
    private double minorRadius;
    private double majorRadius;
    
    //Construct our Torus
    Torus(int numberOfDimensions, double minorRadius, double majorRadius, double volume){
        super(numberOfDimensions, 2 * Math.pow(Math.PI, 2) * majorRadius * Math.pow(minorRadius, 2));;
        this.minorRadius = minorRadius;
    }
    //Set a new minor radius while updating its volume
    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
        setVolume(2 * Math.pow(Math.PI, 2) * majorRadius * Math.pow(minorRadius, 2));
    }
    //Set a new major radius while updating its volume
    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
        setVolume(2 * Math.pow(Math.PI, 2) * majorRadius * Math.pow(minorRadius, 2));
    }
    //Return the minor radius
    public double getMinorRadius() {
        return minorRadius;
    }
    //Return the major radius
    public double getMajorRadius() {
        return majorRadius;
    }
}