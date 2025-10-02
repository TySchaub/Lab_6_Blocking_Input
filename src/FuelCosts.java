import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0;
        double mpg = 0.0;
        double pricePerGal = 0.0;
        double miles100Cost = 0.0;
        double fullTankDistance = 0.0;
        boolean done = false;
        String trash;

        do
        {
            System.out.print("Enter the size of the gas tank in gallons: ");
            if (in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();
                if (tankSize <= 0)
                    System.out.println("Invalid tank size: " + tankSize);
                else {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);
        done = false;

        do
        {
            System.out.print("Enter the mpg of the vehicle: ");
            if (in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg <= 0)
                    System.out.println("Invalid mpg: " + mpg);
                else {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);
        done = false;

        do
        {
            System.out.print("Enter the price per gallon: ");
            if (in.hasNextDouble())
            {
                pricePerGal = in.nextDouble();
                in.nextLine();
                if (pricePerGal <= 0)
                    System.out.println("Invalid price per gallon: " + pricePerGal);
                else {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);

        miles100Cost = (100 / mpg) * pricePerGal;
        fullTankDistance = tankSize * mpg;
        System.out.println("The cost of filling the tank is $" + miles100Cost);
        System.out.println("The distance that can be driven on a full tank is: " + fullTankDistance + " miles");
    }
}
