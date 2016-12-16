import java.util.Scanner;

public class Asking_Questions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age, height_feet, height_inches;
		double weight;
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.print("How tall are you? (feet)");
		height_feet = keyboard.nextInt();
		
		System.out.print("How tall are you? (inches)");
		height_inches = keyboard.nextInt();
		
		System.out.print("How much do you weigh? (pounds)");
		weight = keyboard.nextDouble();
		
		System.out.println("So you're " + age + " old, " + height_feet + "'" + height_inches + " tall, and " + weight
			+ " pounds.");
	}
}