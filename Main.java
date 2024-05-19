/**Main Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be the main menu that calls all of the required classes to either return an area or a volume
 * of a two dimensional shape or a three dimensional shape. It runs through a menu that utilizes javas switch
 * capability and a numerical input system. If there is an invalid number it is looped into a try block that
 * catches non numerical inouts in the menu. It also has error validation for invalid input in the yes or no
 * question for continuing use in the terminal application. Lastly, there is error handling on the torus object
 * to make sure the major radius is indeed larger for an appropriate calculation of the volume. While not
 * implemented each object's dimensions can be changed and the volume will automatically be updated for further
 * modularity of the program.
 */

 //Iport necessary packages
import java.util.InputMismatchException;
import java.util.Scanner;

//Create our main class and void method
public class Main{
    //Main method for our program
    public static void main(String[] args) {

        //initialize all variables we will use
        int numOfDimensions;
        double dimension1;
        double dimension2;
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

            //Initiate a try block to catch invalid inputs into the scanner
            try{
                invalid = false;
                int selection = input.nextInt();//Get users selection 
                switch (selection) {//Create our switch block
                    //If user selects 1, call the circle class and get the area
                    case 1:
                    numOfDimensions = 2;
                    System.out.println("\nEnter the radius of the circle:\n");
                    dimension1 = input.nextDouble();
                    Circle circle = new Circle(numOfDimensions, dimension1, area);
                    System.out.println("\nThe area of the circle is: " + circle.getArea() + "\n");
                    break;
                    //If user selects 2, call the rectangle class and get the area
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
                    //if user selects 3, call the square class and get the area
                    case 3:
                    numOfDimensions = 2;
                    System.out.println("\nYou have selected Square.\n");
                    System.out.println("\nEnter the squares side length:\n");
                    dimension1 = input.nextDouble();
                    Square square = new Square(numOfDimensions, dimension1, area);
                    System.out.println("\nThe area of the square is: " + square.getArea()+"\n");
                    break;
                    //if user selects 4, call the triangle class and get the area
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
                    //if user selects 5, call the sphere class and get volume
                    case 5:
                    numOfDimensions = 3;
                    System.out.println("\nYou have selected Sphere.\n");
                    System.out.println("\nEnter the radius of the sphere:\n");
                    dimension1 = input.nextDouble();
                    Sphere sphere = new Sphere(numOfDimensions, dimension1, volume);
                    System.out.println("\nThe volume of the sphere is: " + sphere.getVolume()+"\n");
                    break;
                    //if user selects 6, call the cube class and get volume
                    case 6:
                    numOfDimensions = 3;
                    System.out.println("\nYou have selected Cube.\n");
                    System.out.println("\nEnter the side length of the cube:\n");
                    dimension1 = input.nextDouble();
                    Cube cube = new Cube(numOfDimensions, dimension1, volume);
                    System.out.println("\nThe volume of the cube is: " + cube.getVolume()+"\n");
                    break;
                    //if user selects 7, call the cone class and get volume
                    case 7:
                    numOfDimensions = 3;
                    System.out.println("\nYou have selected Cone.\n");
                    System.out.println("\nEnter the radius of the cone:\n");
                    dimension1 = input.nextDouble();
                    System.out.println("\nEnter the height of the cone:\n");
                    dimension2 = input.nextDouble();
                    Cone cone = new Cone(numOfDimensions, dimension1, dimension2, volume);
                    System.out.println("\nThe volume of the cone is: " + cone.getVolume() + "\n");
                    break;
                    //if user selects 8, call the cylinder class and get volume
                    case 8:
                    numOfDimensions = 3;
                    System.out.println("\nYou have selected Cylinder.\n");
                    System.out.println("\nEnter the radius of the cylinder:\n");
                    dimension1 = input.nextDouble();
                    System.out.println("\nEnter the height of the cylinder:\n");
                    dimension2 = input.nextDouble();
                    Cylinder cylinder = new Cylinder(numOfDimensions, dimension1, dimension2, volume);
                    System.out.println("\nThe volume of the cylinder is: " + cylinder.getVolume()+"\n");
                    break;
                    //if user selects 9, call the torus class and get volume
                    case 9:
                    numOfDimensions = 3;
                    System.out.println("\nYou have selected Torus.\n");
                    System.out.println("\nEnter the minor radius of the torus:\n");
                    dimension1 = input.nextDouble();
                    System.out.println("\nEnter the major radius of the torus:\n");
                    dimension2 = input.nextDouble();
                    while (dimension1 > dimension2){//Run error validation to make sure major radius is larger
                        System.out.println("\nError: The major radius of the torus must be greater than the minor radius.\n");
                        System.out.println("\nEnter the minor radius of the torus:\n");
                        dimension1 = input.nextDouble();
                        System.out.println("\nEnter the major radius of the torus:\n");
                        dimension2 = input.nextDouble();
                        if (dimension1 < dimension2){//Breaks while loop when appropriate info is entered
                            break;
                        }
                    }
                    Torus torus = new Torus(numOfDimensions, dimension1, dimension2, volume);
                    System.out.println("\nThe volume of the torus is: " + torus.getVolume()+"\n");
                    //Lastly, if user selects 10 the program will end
                    case 10:
                    menu = false;
                    break;
                    //If user selects any numerical value other than 1-10 they will get an error
                    default:
                    System.out.println("\nInvalid selection. Enter a number 1 - 10.\n");
                    invalid = true;
                    break;
                }
                if (invalid == false){//Checks to see if user selected 10 or quit program
                    boolean cont = true;
                    //Prompt user to continue if 10 wasn't selected
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
                        //Will reprompt if not y or n
                        else{
                            System.out.println("\nSorry I do not understand. Enter Y or N.\n");
                        }
                    }
                }
            }
            //Error handling to catch non-numerical inputs from the menu
            catch (InputMismatchException e){
                System.out.println("\nInvalid input. Enter a number 1 - 10.\n");
                input.next();
            }
        }
        input.close();//close our scanner to avoid resource leaks
    }
}


//All testing for getters and setters inside the shapes individual classes.

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

// sphere.setRadius(10);
// System.out.println("\nThe volume of the updated sphere is: " + sphere.getVolume()+"\n");