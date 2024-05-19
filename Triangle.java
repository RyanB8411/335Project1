public class Triangle extends TwoDimensionalShape {

    //Initialize our variables
    private double base;
    private double height;

    //Construct our object
    Triangle(int numberOfDimensions, double base, double height, double area){
        super(numberOfDimensions, (.5 * (base * height)));
        this.base = base;
        this.height = height;
    }
    //Getters and Setters for Triangle class to include updating our area using
    //the parent class.
    public void setBase(double base){
        this.base = base;
        super.setArea((.5 * (base * height)));
    }
    public void setHeight(double height) {
        this.height = height;
        super.setArea((.5 * (base * height)));
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
}