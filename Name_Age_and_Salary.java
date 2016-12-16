import java.util.Scanner;

public class Name_Age_and_Salary
{
	public static void main(String[] args)
	{
		String user_name;
		int user_age;
		double salary;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello. What is your name? ");
		user_name = keyboard.next();
		
		System.out.print("Hi " + user_name + "! How old are you?");
		user_age = keyboard.nextInt();
		
		System.out.print("So you're " + user_age + ", huh? That's not old at all! ");
		System.out.print("How much do you make, " + user_name + "?");
		salary = keyboard.nextDouble();
		
		System.out.print(salary + "! I hope that's per hour and not per year! Haha!");
	}
}