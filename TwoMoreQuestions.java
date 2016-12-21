import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answer1, answer2, guess;
		guess = "";
		
		System.out.println("TWO MORE QUESTIONS!");
		
		System.out.println("\nQuestions 1) Does it stay inside or outside or both?");
		answer1 = keyboard.next();
		
		System.out.println("\nQuestion 2) Is it a living thing?");
		answer2  = keyboard.next();
		
		if(answer1.equals("inside") && answer2.equals("yes"))
		{
			guess = "houseplant";
		}
		if(answer1.equals("outside") && answer2.equals("yes"))
		{
			guess = "bison";
		}
		if(answer1.equals("both") && answer2.equals("yes"))
		{
			guess = "dog";
		}
		if(answer1.equals("inside") && answer2.equals("no"))
		{
			guess = "shower curtain";
		}
		if(answer1.equals("outside") && answer2.equals("no"))
		{
			guess = "billboard";
		}
		if(answer1.equals("both") && answer2.equals("no"))
		{
			guess = "cell phone";
		}
		
		System.out.println("Obviously, the thing on your mind is a " +  guess + ".");
	}
}