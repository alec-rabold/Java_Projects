import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithCounter
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int number, guess, tries = 0;
		number = r.nextInt(9) + 1;
		
		System.out.println("I'm thinking of a number from 1-10.");
		System.out.println("Your guess: ");
		guess = keyboard.nextInt();
		
		while (guess != number)
		{
			System.out.println("\nSorry, that was incorrect.");
			tries++;
			System.out.println("That was attempt #: " + tries + ".");
			System.out.println("Your next guess: ");
			guess = keyboard.nextInt();
			
			
		}
		
		System.out.println("\nThat's correct!");
	}
}