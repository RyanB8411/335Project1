/**Cube Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a Cube object that calculates
 * its area based off the side using its parent class three dimensional
 * shape.
 */

 //Extend our Three Dimensional Shape
 public class Cube extends ThreeDimensionalShape {
    private double side;
    
    //Construct our sphere
    Cube(int numberOfDimensions, double side, double volume){
        super(numberOfDimensions, Math.pow(side, 3));;
        this.side = side;
    }
    //Set a new side length while updating its volume
    public void setSide(double side) {
        this.side = side;
        setVolume(Math.pow(side, 3));
    }
    //Return the side length
    public double getSide() {
        return side;
    }

}