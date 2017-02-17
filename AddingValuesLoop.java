import java.util.Scanner;

public class AddingValuesLoop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number = 1 /*Not zero*/, total = 0;
		
		System.out.println("I will add up all the integers you give me.");
		System.out.println("Just type \"0\" when you are done.");
		
		while (number != 0)
		{
			System.out.println("Number: ");
			number = keyboard.nextInt();
			total = (total + number);
			System.out.println("The total so far is: " + total + ".");
		}
		
		System.out.println("\nThe total is: " + total);
	}
}