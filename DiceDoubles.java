import java.util.Random;

public class DiceDoubles
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int firstRoll, secondRoll;
		firstRoll = r.nextInt(6) + 1;
		secondRoll = r.nextInt(6) + 1;
		
		System.out.println("Here come the dice!");
		
		System.out.println("\n\nRoll #1: " + firstRoll);
		System.out.println("Roll #2: " + secondRoll);
		
		System.out.println("The total is: " + (firstRoll + secondRoll));
		
		while (firstRoll != secondRoll)
		{
			firstRoll = r.nextInt(6) + 1;
			secondRoll = r.nextInt(6) + 1;
		
			System.out.println("\n\nRoll #1: " + firstRoll);
			System.out.println("Roll #2: " + secondRoll);
		
			System.out.println("The total is: " + (firstRoll + secondRoll));
		}
	}
}