import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Count from: ");
		int countFrom = keyboard.nextInt();
		
		System.out.println("Count to: ");
		int countTo = keyboard.nextInt();
		
		System.out.println("Count by: ");
		int countBy = keyboard.nextInt();
		
		for (int i = countFrom; i < countTo; i += countBy)
		{
			System.out.println(i + "  ");
		}
	}
}