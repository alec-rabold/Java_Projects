import java.util.Scanner;

public class AlphabeticalOrder
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name, wait_time;
		
		wait_time = "";
		
		System.out.println("What's your last name? ");
		name = keyboard.next();
		
		if (name.compareTo("Carswell") <= 0)
		{
			wait_time = "You don't have to wait long";
		}
		else if (name.compareTo("Jones") <= 0)
		{
			wait_time = "That's not bad";
		}
		else if (name.compareTo("Smith") <= 0)
		{
			wait_time = "Looks like a bit of a wait";
		}
		else if (name.compareTo("Young") <= 0)
		{
			wait_time = "It's gonna be a while";
		}
		else if (name.compareTo("Young") > 0)
		{
			wait_time = "Not going anyhwhere for a while I hope";
		}
		
		
		System.out.println(wait_time + ", " + name + ".");
		
	}
}