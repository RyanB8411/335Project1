
public class Circle extends TwoDimensionalShape {
    public double radius;
    Circle(int numberOfDimensions, double radius, double area){
        super(numberOfDimensions, area=(radius*Math.PI*Math.PI));
        this.radius = radius;
    }
}