import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int pCard, dCard, pSum, dSum, firstDraw, secondDraw;
		String action = "";
		
		System.out.println("Welcome to Alec's Blackjack!\n");
		
		firstDraw = r.nextInt(10) + 1; // Player
		secondDraw = r.nextInt(10) + 1;
		pSum = firstDraw + secondDraw;
		
		System.out.println("You get a " + firstDraw + " and "
			+ secondDraw + ".");
		System.out.println("Your total is " + pSum + ".");
		
		firstDraw = r.nextInt(10) + 1; // Dealer 
		secondDraw = r.nextInt(10) + 1;
		dSum = firstDraw + secondDraw;
		
		System.out.println("\nThe dealer has a " + firstDraw + " and a hidden card.");
		System.out.println("His total is hidden too.");
		
		System.out.println("\nWould you like to \"hit\" or \"stay\"?");
		action = keyboard.nextLine();
		
		while (action.equals("hit"))
		{
			pCard = r.nextInt(10) + 1;
			System.out.println("\nYou drew a " + pCard + ".");
			pSum = pSum + pCard;
			System.out.println("Your total is " + pSum + ".");
			if (pSum > 21)
			{
				System.out.println("\nYou went over 21.");
				break;
			}
			System.out.println("\nWould you  like to \"hit\" or \"stay\"?");
			action = keyboard.nextLine();
		}
		
		System.out.println("\nOkay, dealer's turn.");
		System.out.println("His hidden card was " + secondDraw + ".");
		System.out.println("His total was " + dSum + ".");
		
		while (dSum <= 16)
		{
			System.out.println("\nDealer decides to hit.");
			dCard = r.nextInt(10) + 1;
			System.out.println("He drew " + dCard + ".");
			dSum = dSum + dCard;
			System.out.println("His total is " + dSum + ".");
		}
		
		System.out.println("Dealer stays.");
		
		System.out.println("\nDealer total is " + dSum + ".");
		System.out.println("Your total is " + pSum + ".\n");
		
		if (((pSum < dSum) || (pSum > 21)) && (dSum <= 21))
		{
			System.out.println("\nSorry, you lose.");
		}
		else if (((pSum > dSum) || (dSum > 21)) && (pSum <= 21)) 
		{
			System.out.println("\nNice, you win!");
		}
		else if (((pSum > 21) && (dSum > 21)) || (pSum == dSum))
		{
			System.out.println("\nIt's a tie!");
		}
		
		
	}
}