import java.util.Scanner;

public class Refresher2
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		
		int numberRepeat = 10;
		
		System.out.println("Your name: ");
		String name = kb.nextLine();
		
		if(name.equals("Mitchell"))
		{
			numberRepeat = 5;
		}
		
		System.out.println("");
		
		for(int i = 0; i < numberRepeat; i++)
		{
			System.out.println(name);
		}
	}
}