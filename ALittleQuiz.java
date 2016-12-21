import java.util.Scanner;

public class ALittleQuiz
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int inputAnswer1, inputAnswer2, inputAnswer3,
			correctAnswer1 = 3, correctAnswer2 = 2, 
			correctAnswer3 = 2, numberCorrect = 0;
			// I could use only one "inputAnswer" int and
			// treat it as a temp variable
		
		System.out.println("Are you ready for a quiz?");
		keyboard.next();
		System.out.println("Okay, here it comes!");
		
		// Question 1
		
		System.out.println("\nQ1) What is the capital of Alaska?");
		System.out.println("    1) Melbourne");
		System.out.println("    2) Anchorage");
		System.out.println("    3) Juneau\n");
		inputAnswer1 = keyboard.nextInt();
		
		if (inputAnswer1 == correctAnswer1)
		{
			System.out.println("That's right!");
			numberCorrect = numberCorrect + 1;
		}
		else 
		{
			System.out.println("Sorry, the answer is Anchorage.");
		}
		
		// Question 2
		
		System.out.println("\nQ2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("    1) Yes");
		System.out.println("    2) No");
		inputAnswer2 = keyboard.nextInt();
		
		if (inputAnswer2 == correctAnswer2)
		{
			System.out.println("That's right!");
			numberCorrect = numberCorrect + 1;
		}
		else 
		{
			System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
		}
		
		// Question 3
		
		System.out.println("\nQ3) What is the result of 9+6/3?");
		System.out.println("    1) 5");
		System.out.println("    2) 11");
		System.out.println("    3) 15/3");
		inputAnswer3 = keyboard.nextInt();
		
		if (inputAnswer3 == correctAnswer3)
		{
			System.out.println("That's right!");
			numberCorrect = numberCorrect + 1;
		}
		else 
		{
			System.out.println("Sorry, the answer is 11.");
		}
		
		// Number correct out of 3
		
		System.out.println("Overall you got " + numberCorrect + " correct.");
		System.out.println("Thanks for playing!");		
		
	}
}