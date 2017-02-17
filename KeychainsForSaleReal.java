import java.util.Scanner;

public class KeychainsForSaleReal
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int choice = 0;
		int keychains = 0;
		
		System.out.println("Ye Olde Keychain Shoppe");
		while (choice != 4)
		{
			System.out.println("\n1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			
			System.out.println("\nPlease enter your choice: ");
			choice = kb.nextInt();
			
			if (choice == 1) 
			{
				keychains = add_keychains(keychains);	 
			}	
			else if (choice == 2) 
			{
				keychains = remove_keychains(keychains);
			}
			else if (choice == 3) 
			{
				view_order(keychains);
			}
		}
		checkout(keychains);
	}
	
	public static int add_keychains(int keychains)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("\nYou have " + keychains + " keychains. " +
			"How many to add?");
		int add = kb.nextInt();
		int new_keychains = keychains + add;
		System.out.println("You now have " + new_keychains + " keychains.");
		return new_keychains;
	}
	
	public static int remove_keychains(int keychains)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("\nYou have " + keychains + " keychains. " +
			"How many to remove?");
		int subtract = kb.nextInt();
		int new_keychains = keychains - subtract;
		System.out.println("You now have " + new_keychains + " keychains.");
		return new_keychains;
	}
	
	public static int view_order(int keychains)
	{
		System.out.println("\nYou have " + keychains + " keychains.");
		System.out.println("Keychains cost $10 each.");
		System.out.println("Total cost is $" + (keychains * 10) + ".");
		return 0;
	}
	
	public static int checkout(int keychains)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.nextLine();
		System.out.println("You have " + keychains + " keychains.");
		System.out.println("Keychains cost $10 each.");
		System.out.println("Total cost is $" + (10*keychains) + ".");
		System.out.println("Thanks for your order, " + name + "!");
		return 0;
	}
	
	
}