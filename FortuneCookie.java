import java.util.Scanner;
import java.util.Random;

public class FortuneCookie
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int randomNumber;
		
		randomNumber = r.nextInt(5);
		
		if (randomNumber == 0)
		{
			System.out.println("Fortune cookie says: " +
				"\"You will find happiness with new love\"");
		}
		if (randomNumber == 1)
		{
			System.out.println("Fortune cookie says: " +
				"\"You will live long and prosper\"");
		}
		if (randomNumber == 2)
		{
			System.out.println("Fortune cookie says: " +
				"\"You will eat a delicious fortune cookie\"");
		}
		if (randomNumber == 3)
		{
			System.out.println("Fortune cookie says: " +
				"\"You will read an insightful quote\"");
		}
		if (randomNumber == 4)
		{
			System.out.println("Fortune cookie says: " +
				"\"This is your fortune\"");
		}
		if (randomNumber == 5)
		{
			System.out.println("Fortune cookie says: " +
				"\"Fortune cookies only work if you eat the paper\"");
		}
	}
}