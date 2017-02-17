import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main(String[] args) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		int input = 1; //temp
		System.out.println("SQUARE ROOT!");
		System.out.println("Type \"0\" to exit");
		
		while (input != 0)
		{
			System.out.println("Enter a number: ");
			if (input > 0)
			{
				input = keyboard.nextInt();
				System.out.println("The square root is: " +
				Math.sqrt(input));
			}
			else if (input < 0)
			{
				System.out.println("You can't take the square root " +
					"of a negative number (so easily..)");
				Thread.sleep(600);
				input = 1; // Set to positive to take out of endless loop	
			}
		}
		
	}
}