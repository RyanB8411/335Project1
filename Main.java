import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int numOfDimensions;
        double dimension1;
        double dimension2;
        double dimension3;
        double area = 0;
        double volume = 0;
        Scanner input = new Scanner(System.in);
        boolean menu = true;
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
            int selection = input.nextInt();
            switch (selection) {
                case 1:
                numOfDimensions = 2;
                System.out.println("Enter the radius of the circle: ");
                dimension1 = input.nextDouble();
                Circle circle = new Circle(numOfDimensions, dimension1, area);
                System.out.println("The area of the circle is: " + circle.getArea());
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
                case 10:
                    menu = false;
                    break;
            }
            boolean cont = true;
            while (cont){
                System.out.println("Would you like to continue? (Y or N)\n");
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
                    System.out.println("Sorry I do not understand. Enter Y or N.");
                }
            }
        }

    }
}


//All testing for all methods.


// System.out.println("Please enther the lenght of the rectangle\t");
// dimension1 = input.nextDouble();
// System.out.println("Please enter the width of the rectangle\t");
// dimension2 = input.nextDouble();
// Rectangle rec1 = new Rectangle(2,dimension1,dimension2,area);
// System.out.println("The area of the rectangle is " + rec1.getArea());