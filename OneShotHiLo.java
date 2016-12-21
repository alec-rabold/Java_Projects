import java.util.Scanner;
import java.util.Random;

public class OneShotHiLo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int randomNumber, guess;
		randomNumber = r.nextInt(99) + 1;
		
		System.out.println("I'm thinking of a number between 1-100." +
			"Try to guess it.");
		guess = keyboard.nextInt();
		
		if (guess < randomNumber)
		{
			System.out.println("Sorry, you are too low. I was thinking of " +
				randomNumber);
		}
		if (guess > randomNumber)
		{
			System.out.println("Sorry, you are too high. I was thinking of " +
				randomNumber);
		}
		if (guess == randomNumber)
		{
			System.out.println("You guess it! What are the odds??");
		}
		
	}
}