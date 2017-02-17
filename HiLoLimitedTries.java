import java.util.Scanner;
import java.util.Random;

public class HiLoLimitedTries
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int  number, guess, tries = 0;
		number = r.nextInt(100) + 1;
		
		System.out.println("I'm thinking of a number from 1-100.");
		System.out.println("You get 7 attempts to guess it.");
		System.out.println("I will tell you whether your guess is too "
			+ "high or too low.");
		
		System.out.println("\nYour guess: ");
		guess = keyboard.nextInt();
		
		while (guess != number)
		{
			if (guess < number)
			{
				System.out.println("Sorry, that is too low.");
				tries ++;
				System.out.println("You have " + (7 - tries) + " tries left.");
				System.out.println("\nYour guess: ");
				guess = keyboard.nextInt();
			}
			if (guess > number)
			{
				System.out.println("Sorry, that is too high.");
				tries ++;
				System.out.println("You have " + (7 - tries) + " tries left.");
				System.out.println("\nYour guess: ");
				guess = keyboard.nextInt();
			}
		}
		System.out.println("That's correct, nice job!");
	}
}