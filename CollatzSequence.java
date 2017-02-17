import java.util.Scanner;

public class CollatzSequence
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int sequenceNumber;
		
		System.out.println("Input number: ");
		sequenceNumber = keyboard.nextInt();
		
		while (sequenceNumber != 1)
		{
			if ((sequenceNumber % 2) == 0) // Even number
			{
				sequenceNumber = sequenceNumber / 2;
				System.out.print(sequenceNumber + "   ");
			}
			else if (sequenceNumber == 0)
			{
				break;
			}
			else // Odd number
			{
				sequenceNumber = (3 * sequenceNumber + 1);
				System.out.print(sequenceNumber + "   ");
			}
		}
	}
}