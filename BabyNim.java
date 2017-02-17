import java.util.Scanner;

public class BabyNim
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int pileA = 3, pileB = 3, pileC = 3, numberRemove;
		String chosenPile;
		
		while ((pileA > 0) || (pileB > 0) || (pileC > 0))
		{
			System.out.println("A: " + pileA + "  B: " + pileB +
				"  C: " + pileC);
			System.out.println("\nChoose a pile: ");
			chosenPile = keyboard.next();
			
			if (chosenPile.equals("A"))
			{
				System.out.println("How many to remove from pile A: ");
				numberRemove = keyboard.nextInt();
				pileA = pileA - numberRemove;
			}
			else if (chosenPile.equals("B"))
			{
				System.out.println("How many to remove from pile B: ");
				numberRemove = keyboard.nextInt();
				pileB = pileB - numberRemove;
			}
			else if (chosenPile.equals("C"))
			{
				System.out.println("How many to remove from pile C: ");
				numberRemove = keyboard.nextInt();
				pileC = pileC - numberRemove;
			}
		}
		System.out.println("A: " + pileA + "  B: " + pileB +
				"  C: " + pileC);
	}
}