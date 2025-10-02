import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double hypotenuse = 0.0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter the length of the rectangle: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                if (length <= 0) {
                    System.out.println("Invalid length: " + length);
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);
        done = false;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width <= 0) {
                    System.out.println("Invalid width: " + width);
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);
        done = false;

        area = length * width;
        perimeter = 2 * (length + width);
        hypotenuse = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The hypotenuse of the rectangle is " + hypotenuse);
    }
}
