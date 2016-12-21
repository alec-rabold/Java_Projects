import java.util.Scanner;

public class TheWorstNumberGuessingGameEver
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int guess, secretNumber = 6;
		
		System.out.println("Welcome to the worst number guessing game ever..");
	
		System.out.println("\nI'm thinking of a number from 1-10. Try to guess! ");
		guess = keyboard.nextInt();
		
		if (guess == secretNumber)
		{
			System.out.println("Nice job, you win.");
		}
		else 
		{
			System.out.println("Sorry, the answer is 6. You lose.");
		}
	}
}