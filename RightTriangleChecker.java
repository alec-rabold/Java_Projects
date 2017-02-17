import java.util.Scanner;

public class RightTriangleChecker
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int side1=0, side2=0, side3=0;
		
		System.out.println("This program checks if three sides create a right triangle");
		System.out.println("Please input the 3 sides (integers) in ascending order");
		
		System.out.println("Side 1: ");
		side1 = keyboard.nextInt();
		
		do
		{
			System.out.println("Side 2: ");
			side2 = keyboard.nextInt();
			if (side2 < side1)
			{
				System.out.println("Remember, the sides must be in ascending order.");
				System.out.println("Try again.");
			}
		} while (side2 < side1);
		
		do
		{
			System.out.println("Side 3: ");
			side3 = keyboard.nextInt();
			if (side3 < side2)
			{
				System.out.println("Remember, the sides must be in ascending order.");
				System.out.println("Try again.");
			}
		} while (side3 < side2);
		
		if ((side1*side1+side2*side2) == side3*side3)
		{
			System.out.println("This IS a right triangle!");
		}
		else if ((side1*side1+side2*side2) != side3*side3)
		{
			System.out.println("This IS NOT a right triangle!");
		}
		
		
	}
}