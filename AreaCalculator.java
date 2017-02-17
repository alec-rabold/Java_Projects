import java.util.Scanner;

public class AreaCalculator
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int shapeChoice = 0;
		
		System.out.println("Shape Area Calculator Version 0.1");
		
		while (shapeChoice != 5)
		{
			System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			System.out.println("Which shape?");
			shapeChoice = kb.nextInt();
		
			if (shapeChoice == 1)
			{
				System.out.println("\nBase: ");
				int base = kb.nextInt();
				System.out.println("Height: ");
				int height = kb.nextInt();			
				System.out.println("\nThe area is " + area_triangle(base, height)
				+ ".\n");		
			}
			else if (shapeChoice == 2)
			{
				System.out.println("\nLength: ");
				int length = kb.nextInt();
				System.out.println("Width: ");
				int width = kb.nextInt();			
				System.out.println("\nThe area is " + area_rectangle(length, width)
				+ ".");		
			}
			else if (shapeChoice == 3)
			{
				System.out.println("\nSide Length: ");
				int sideLength = kb.nextInt();		
				System.out.println("\nThe area is " + area_square(sideLength) 
				+ ".");		
			}
			else if (shapeChoice == 4)
			{
				System.out.println("\nRadius: ");
				int radius = kb.nextInt();		
				System.out.println("\nThe area is " + area_circle(radius)
				+ ".");		
			}	
		}
		System.out.println("\nGoodybe.");
	}
	
	public static double area_circle(int radius)
	{
		double A = 3.14 * radius * radius;
		return A;
	}
	
	public static int area_rectangle(int length, int width)
	{
		int A = length * width;
		return A;
	}
	
	public static int area_square(int side)
	{
		int A = side * side;
		return A;
	}
	
	public static double area_triangle(int base, int height)
	{
		double A = (base * height) / 2.0;
		return A;
	}
}
