import java.util.Scanner;

public class Dumb_Calculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double first_number, second_number, third_number;
		
		System.out.println("What is your first number? ");
		first_number = keyboard.nextDouble();
		
		System.out.println("What is your second number? ");
		second_number = keyboard.nextDouble();
		
		System.out.println("What is your third number?");
		third_number = keyboard.nextDouble();
		
		System.out.println("(" + first_number + " + " + second_number +
			" + " + third_number + ") / 2 is... " + ((first_number + second_number
			+ third_number) / 2));
	}
}