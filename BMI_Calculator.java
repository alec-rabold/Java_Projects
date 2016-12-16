import java.util.Scanner;

public class BMI_Calculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double height, weight;
		
		System.out.println("What is your height in meters? ");
		height = keyboard.nextDouble();
		
		System.out.println("What is your weight in kg? ");
		weight = keyboard.nextDouble();
		
		System.out.println("Your BMI is " + (weight / (height*height)));
	}
}