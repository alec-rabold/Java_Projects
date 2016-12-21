import java.util.Scanner;

public class Space_Boxing
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int answer, earth_weight;
		double relative_gravity;
		
		answer = 0;
		
		System.out.println("Please enter your current earth weight: ");
		earth_weight = keyboard.nextInt();
		
		System.out.println("\nI have information for the following planets: ");
		System.out.println("    1. Venus    2. Mars    3. Jupiter");
		System.out.println("    4. Saturn   5. Uranus  6. Netpune");
		
		System.out.println("\nWhich planet are you visiting? ");
		answer = keyboard.nextInt();
		
		if (answer == 1) 
		{
			System.out.println("Your weight would be " + (earth_weight * 0.78) + 
			" pounds on that planet.");
		}
		else if (answer == 2)
		{
			System.out.println("Your weight would be " + (earth_weight * 0.39) + 
			" pounds on that planet.");
		}
		else if (answer == 3)
		{
			System.out.println("Your weight would be " + (earth_weight * 2.65) + 
			" pounds on that planet.");
		}
		else if (answer == 4)
		{
			System.out.println("Your weight would be " + (earth_weight * 1.17) + 
			" pounds on that planet.");
		}
		else if (answer == 5)
		{
			System.out.println("Your weight would be " + (earth_weight * 1.05) + 
			" pounds on that planet.");
		}
		else if (answer == 6)
		{
			System.out.println("Your weight would be " + (earth_weight * 1.23) + 
			" pounds on that planet.");
		}		
	}
}