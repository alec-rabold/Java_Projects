import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int guess, randomNumber;
		randomNumber = 1 + r.nextInt(10);
		
		System.out.println("I'm thinking of a number from 1 to 10..");
		System.out.println("Your guess: ");
		guess = keyboard.nextInt();
		
		if (guess != randomNumber)
		{
			System.out.println("Sorry, but I was really thinking of " + randomNumber + ".");
		}
		else if (guess == randomNumber)
		{
			System.out.println("That's right! My secret number was " + randomNumber + ".");
		}
	}
}