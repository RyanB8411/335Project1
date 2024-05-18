public class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;
    private double area;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = length * width;
    }

    // getters and setters for length and width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        super.setArea(area);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        super.setArea(area);
    }

    @Override
    public void setArea(double area) {
        this.area = length * width;
    }

    @Override
    public double getArea(){
        return area;
    }
}