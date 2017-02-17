import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int ace_number, guess;
		ace_number = r.nextInt(3) + 1;
		
		System.out.println("\nYou slide up to Fast Eddie's card table and " +
			"plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye " +
			"and starts shuffling.");
		System.out.println("He lays down three cards.");
		
		System.out.println("\n Which one is the ace?\n");
		
		System.out.println("      ## ## ##");
		System.out.println("      ## ## ##");
		System.out.println("      1  2  3 \n");
		
		guess = keyboard.nextInt();
		
		if (guess != ace_number)
		{
			System.out.println("\nHa! Fast Eddie wins again! The ace was card number " +
				ace_number + ".\n");
			
		}
		else if (guess == ace_number)
		{
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your " +
				"winnings, scowling.");
		}
		
		if (ace_number == 1)
		{
			System.out.println("      AA ## ##");
			System.out.println("      AA ## ##");
			System.out.println("      1  2  3 ");
		}
		else if (ace_number == 2)
		{
			System.out.println("      ## AA ##");
			System.out.println("      ## AA ##");
			System.out.println("      1  2  3 ");
		}
		else if (ace_number == 3)
		{
			System.out.println("      ## ## AA");
			System.out.println("      ## ## AA");
			System.out.println("      1  2  3 ");
		}
	}
}