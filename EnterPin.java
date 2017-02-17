import java.util.Scanner;

public class EnterPin
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int pin = 1234;
		
		System.out.println("Please enter your pin: ");
		int entry = keyboard.nextInt();
		
		while (entry != pin)
		{
			System.out.println("Sorry, that was incorrect.");
			System.out.println("Please enter your pin: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		
	}
}