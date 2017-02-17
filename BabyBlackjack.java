import java.util.Scanner;
import java.util.Random;

public class BabyBlackjack
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random(); 
		
		int pCard1, pCard2, dCard1, dCard2, pSum, dSum;
		
		System.out.println("Baby Blackjack!\n");
		
		pCard1 = r.nextInt(10) + 1;
		pCard2 = r.nextInt(10) + 1;
		pSum = pCard1 + pCard2;
		dCard1 = r.nextInt(10) + 1;
		dCard2 = r.nextInt(10) + 1;
		dSum = dCard1 + dCard2;
		System.out.println("You drew a " + pCard1 + " and " + pCard2 + ".");
		System.out.println("Your total is " + pSum + ".");
		System.out.println("\nThe dealer drew a " + dCard1 + " and " + dCard2 + ".");
		System.out.println("The dealer's total is " + dSum + ".");
		
		if (pSum < dSum)
		{
			System.out.println("\nSorry, you lose.");
		}
		else if (pSum > dSum)
		{
			System.out.println("\nNice, you win!");
		}
		
		
	}
}