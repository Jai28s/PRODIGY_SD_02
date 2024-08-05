import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minNumber = 1;
        int maxNumber = 100; // You can adjust the range as needed

        int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I've picked a number between " + minNumber + " and " + maxNumber + ". Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed it right!");
                System.out.println("Number of attempts: " + attempts);
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }

        scanner.close();
    }
}
