import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    //Main method for our program
    public static void main(String[] args) {

        //initialize all variables we will use
        int numOfDimensions;
        double dimension1;
        double dimension2;
        double dimension3;
        double area = 0;
        double volume = 0;
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        boolean invalid = false;

        //Create a while loop to continuously run the menu until user selects 10
        while (menu) {
            System.out.println("*********Welcome to the Java OO Shapes Program**********\n\n");
            System.out.println("Select from the menu below:");
            System.out.println("\t1. Construct a Circle.");
            System.out.println("\t2. Construct a Rectangle.");
            System.out.println("\t3. Construct a Square.");
            System.out.println("\t4. Construct a Triangle.");
            System.out.println("\t5. Construct a Sphere.");
            System.out.println("\t6. Construct a Cube.");
            System.out.println("\t7. Construct a Cone.");
            System.out.println("\t8. Construct a Cylinder");
            System.out.println("\t9. Construct a Torus");
            System.out.println("\t10. Exit the Program\n");
            try{
                invalid = false;
                int selection = input.nextInt();
                switch (selection) {
                    case 1:
                    numOfDimensions = 2;
                    System.out.println("\nEnter the radius of the circle:\n");
                    dimension1 = input.nextDouble();
                    Circle circle = new Circle(numOfDimensions, dimension1, area);
                    System.out.println("\nThe area of the circle is: " + circle.getArea() + "\n");
                    break;
                    case 2:
                    numOfDimensions = 2;
                    System.out.println("\nYou have selected Rectangle.\n");
                    System.out.println("\nEnter the length of the rectangle:\n");
                    dimension1 = input.nextDouble();
                    System.out.println("\nEnter the width of the rectangle:\n");
                    dimension2 = input.nextDouble();
                    Rectangle rectangle = new Rectangle(numOfDimensions, dimension1, dimension2, area);
                    System.out.println("\nThe area of the rectangle is: " + rectangle.getArea()+"\n");
                    break;
                    case 3:
                    numOfDimensions = 2;
                    System.out.println("\nYou have selected Square.\n");
                    System.out.println("\nEnter the squares side length:\n");
                    dimension1 = input.nextDouble();
                    Square square = new Square(numOfDimensions, dimension1, area);
                    System.out.println("\nThe area of the square is: " + square.getArea()+"\n");
                    break;
                    case 4:
                    numOfDimensions = 2;
                    System.out.println("\nYou have selected Triangle.\n");
                    System.out.println("\nEnter the base of the triangle:\n");
                    dimension1 = input.nextDouble();
                    System.out.println("\nEnter the height of the triangle:\n");
                    dimension2 = input.nextDouble();
                    Triangle triangle = new Triangle(numOfDimensions, dimension1, dimension2, area);
                    System.out.println("\nThe area of the triangle is: " + triangle.getArea()+"\n");

                    break;
                    case 10:
                    menu = false;
                    break;
                    default:
                    System.out.println("\nInvalid selection. Enter a number 1 - 10.\n");
                    invalid = true;
                    break;
                }
                if (invalid == false){
                    boolean cont = true;
                    while (cont){
                        System.out.println("\nWould you like to continue? (Y or N)\n");
                        String answer = input.next();
                        if (answer.equalsIgnoreCase("N")) {
                            menu = false;
                            cont = false;
                        }
                        else if(answer.equalsIgnoreCase("Y")){
                            menu = true;
                            cont = false;
                        }
                        else{
                            System.out.println("\nSorry I do not understand. Enter Y or N.\n");
                        }
                    }
                }
            }
            catch (InputMismatchException e){
                System.out.println("\nInvalid input. Enter a number 1 - 10.\n");
                input.next();
            }
        }
    }
}


//All testing for all methods.

// circle.setRadius(10);
// System.out.println(circle.getRadius() + " " + circle.getArea());

// rectangle.setLength(12);
// System.out.println(rectangle.getArea());
// rectangle.setWidth(12);
// System.out.println(rectangle.getArea());

// square.setSide(12);
// System.out.println(square.getArea());

//triangle.setBase(12);
// triangle.setHeight(12);
// System.out.println("\nThe area of the updated triangle is: " + triangle.getArea()+"\n");

