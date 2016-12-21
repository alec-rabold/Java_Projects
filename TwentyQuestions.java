import java.util.Scanner;

public class TwentyQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String inputQuestion1, inputQuestion2, guess;
		
		guess = "";
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it..");
		
		System.out.println("\nQuestion 1) Is it an animal, vegetable, or mineral? (Choose One)");
		inputQuestion1 = keyboard.next();
		
		System.out.println("\nQuestion 2) Is it bigger than a breadbox? (yes/no)");
		inputQuestion2 = keyboard.next();
		
		if (inputQuestion1.equals("animal"))
		{
			if (inputQuestion2.equals("yes")) // Bigger than breadbox
			{
				guess = "moose";
			}
			else if (inputQuestion2.equals("no"))
			{
				guess = "squirrel";
			}
		}
		else if (inputQuestion1.equals("vegetable"))
		{
			if (inputQuestion2.equals("yes"))
			{
				guess = "watermelon";
			}
			else if (inputQuestion2.equals("no"))
			{
				guess = "carrot";
			}
		}
		else if (inputQuestion1.equals("mineral"))
		{
			if (inputQuestion2.equals("yes"))
			{
				guess = "Camaro";
			}
			else if (inputQuestion2.equals("no"))
			{
				guess = "paper clip";
			}
		}
		
		System.out.println("My guess it that you are thinking of a " + guess);
	}
}