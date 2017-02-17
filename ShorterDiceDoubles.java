import java.util.Random;

public class ShorterDiceDoubles
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int firstRoll, secondRoll;
		
		System.out.println("Here come the dice!");
		
		do 
		{
		firstRoll = r.nextInt(6) + 1;
		secondRoll = r.nextInt(6) + 1;
		
		System.out.println("\n\nRoll #1: " + firstRoll);
		System.out.println("Roll #2: " + secondRoll);
		
		System.out.println("The total is: " + (firstRoll + secondRoll));
		} while (firstRoll != secondRoll);
	}
}