import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enther the lenght of the rectangle\t");
        double length = scan.nextDouble();
        System.out.println("Please enter the width of the rectangle\t");
        double width = scan.nextDouble();
        Rectangle rec1 = new Rectangle(length, width);
        System.out.println("The area of the rectangle is " + rec1.getArea());
        System.out.println("Enter a new length:\t");
        double length2 = scan.nextDouble();
        rec1.setLength(length2);
        System.out.println(rec1.getArea());
    }
}