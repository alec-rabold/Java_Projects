import java.util.Scanner;

public class DisplayingMultiples
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Choose a number: ");
		int number = kb.nextInt();
		
		for(int i = 0; i < number; i++)
		{
			System.out.println(number + "x" + (i+1) + " = " + (number*(i+1)));
		}
	}
}