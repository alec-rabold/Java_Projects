import java.util.Scanner;

public class Refresher
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = kb.nextLine();
		
		System.out.println("\nHow many times do you want it printed?");
		int n = kb.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(name);
		}
	}
}