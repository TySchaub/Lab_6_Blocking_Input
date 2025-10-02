import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        int targetNum = 0;
        int guessNum = 0;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        targetNum = rand.nextInt(10) + 1; // random number between 1 an 10

        boolean done = false;
        String trash = "";

            do {
                System.out.print("Guess a number between 1 and 10: ");
                if (in.hasNextInt()) {
                    guessNum = in.nextInt();
                    in.nextLine();
                    if (guessNum == targetNum) {
                        System.out.println("You guessed it right!");
                        done = true;
                    } else if (guessNum < targetNum) {
                        System.out.println("Too low!");
                    } else if (guessNum < 1 || guessNum > 10) {
                        System.out.println("Your guess is out of range.");
                    } else if (guessNum > targetNum) {
                        System.out.println("Too high!");
                    }
                }
                else {
                    trash = in.nextLine();
                    System.out.println("Invalid input: " + trash);
                }
            } while (!done);
    }
}
