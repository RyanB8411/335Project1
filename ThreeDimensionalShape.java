/**Three Dimensional Object Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to extend the shape class to add three dimension and 
 * the volume to our object
 */

 //Extend our Shape
public class ThreeDimensionalShape extends Shape {
    public double volume;

    //Construct the three dimensional object
    public ThreeDimensionalShape(int numberOfDimensions, double volume) {
        super(3);
        this.volume = volume;
    }
    //Set the volume of the object
    public void setVolume(double volume) {
        this.volume = volume;
    }
    //Get the volume of the object
    public double getVolume() {
        return Math.round(volume*100)/100.0;
    }
}