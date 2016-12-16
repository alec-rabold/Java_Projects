import java.util.Scanner;

public class How_Old_Are_You
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("Hey, what's your name? ");
		name = keyboard.next();
		
		System.out.println(""); // Line break
		
		System.out.println("Ok, " + name + ", how old are you? ");
		age = keyboard.nextInt();
		
		System.out.println(""); // Line break
		
		if (age < 16)
		{
			System.out.println("You can't drive, " + name);
		}
		if (age > 16)
		{
			System.out.println("You can drive, " + name);
		}
		
		if (age < 25)
		{
			System.out.println("You can't rent a car, " + name);
		}
		if (age > 25)
		{
			System.out.println("You can rent a car, " + name);
		}
	}
}