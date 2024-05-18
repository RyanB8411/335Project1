public class TwoDimensionalShape extends Shape {
    public double area;
    public double dimension1;
    public double dimension2;

    public TwoDimensionalShape(int numberOfDimensions, double dimension1, double dimension2) {
        super(2);
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    public void setDimension1(double dimension1) {
        this.dimension1 = dimension1;
        setArea(dimension1, dimension2);
    }
    public void setDimension2(double dimension2) {
        this.dimension2 = dimension2;
        setArea(dimension1, dimension2);
    }
    public double getDimension1() {
        return dimension1;
    }
    public double getDimension2() {
        return dimension2;
    }
    public void setArea(double dimension1, double dimension2) {
        this.area = dimension1 * dimension2;
    }
    // getter and setter for area
    public double getArea() {
        return area;
    }
}