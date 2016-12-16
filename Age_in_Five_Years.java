import java.util.Scanner;

public class Age_in_Five_Years
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String user_name;
		int age;
		
		System.out.println("Hello. What is your name? ");
		user_name = keyboard.next();
		
		System.out.println(""); // Act as a line break
		
		System.out.println("Hi, " + user_name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("");
		
		System.out.println("Did you know that in five years you will be " + (age + 5)
			+ " years old?");
		System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
		
	}
}