import java.util.Scanner;

public class More_User_Input 
{
	public static void main(String[] args)
	{
		String first_name, last_name, login_name;
		int grade, id_number;
		double GPA;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println("");
		
		System.out.print("First name: ");
		first_name = keyboard.next();
		
		System.out.print("Last name: ");
		last_name = keyboard.next();
		
		System.out.print("Grade (9-12): ");
		grade = keyboard.nextInt();
		
		System.out.print("Student ID: ");
		id_number = keyboard.nextInt();
		
		System.out.print("Login: ");
		login_name = keyboard.next();
		
		System.out.print("GPA (0.0 - 4.0): ");
		GPA = keyboard.nextDouble();
		
		System.out.println("");
		
		System.out.print("Your information:");
		System.out.println("");
		System.out.println("	Login: " + login_name);
		System.out.println("	ID: " + id_number);
		System.out.println("	Name: " + last_name + ", " + first_name);
		System.out.println("	GPA: " + GPA);
		System.out.println("	Grade: " + grade);
	}
}