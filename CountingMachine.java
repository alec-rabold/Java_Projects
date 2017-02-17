import java.util.Scanner;

public class CountingMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Count to: ");
		int countTo = keyboard.nextInt();
		
		for (int i = 0; i < countTo; i++)
		{
			System.out.println(i + "  ");
		}
	}
}