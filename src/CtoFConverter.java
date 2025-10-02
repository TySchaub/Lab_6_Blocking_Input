import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        double celsius = 0.0; // example temperature
        double fahrenheit = 0.0; // (celsius * 9/5) + 32;
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash;

        do {
            System.out.print("Enter a temperature in Celsius:");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);
    }
}