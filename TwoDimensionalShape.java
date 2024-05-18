public class TwoDimensionalShape extends Shape {
    public double area;

    public TwoDimensionalShape(int numberOfDimensions, double area) {
        super(numberOfDimensions);
        this.area = area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getArea() {
        return area;
    }
}