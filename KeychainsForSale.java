import java.util.Scanner;

public class KeychainsForSale
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Ye Olde Keychain Shoppe");
		while (choice != 4)
		{
			System.out.println("\n1. Add keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			
			System.out.println("\nPlease enter your choice: ");
			choice = kb.nextInt();
			
			if (choice == 1) {add_keychains();}	
			else if (choice == 2) {remove_keychains();}
			else if (choice == 3) {view_order();}
		}
		checkout();
	}
	
	public static String add_keychains()
	{
		System.out.println("ADD KEYCHAINS");
		return null;
	}
	
	public static String remove_keychains()
	{
		System.out.println("REMOVE KEYCHAINS");
		return null;
	}
	
	public static String view_order()
	{
		System.out.println("VIEW ORDER");
		return null;
	}
	
	public static String checkout()
	{
		System.out.println("CHECKOUT");
		return null;
	}
	
	
}