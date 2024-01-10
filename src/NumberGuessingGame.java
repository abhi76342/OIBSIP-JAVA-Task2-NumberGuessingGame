import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int lowerBound = 1;
		int upperBound = 100;
		int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

		int maxAttempts = 10;
		int attempts = 0;

		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println(
				"I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

		while (attempts < maxAttempts) {
			System.out.print("Enter your guess: ");
			int userGuess = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			attempts++;

			if (userGuess == numberToGuess) {
				System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
				break;
			} else if (userGuess < numberToGuess) {
				System.out.println("Try again! The number is higher.");
			} else {
				System.out.println("Try again! The number is lower.");
			}

			int remainingAttempts = maxAttempts - attempts;
			System.out.println("Attempts left: " + remainingAttempts);
		}

		if (attempts == maxAttempts) {
			System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
		}

		scanner.close();
	}
}
