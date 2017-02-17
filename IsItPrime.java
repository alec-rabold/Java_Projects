public class IsItPrime
{
	public static void main(String args[])
	{
		for(int i = 1; i < 50; i++)
		{
			if(isItPrime(i))
			{
				System.out.println(i + " is NOT prime.");
			}
			else
			{
				System.out.println(i + " is prime.");
			}
		}
	}
	public static boolean isItPrime(int n)
	{
		boolean primeTF = false;
		
		for(int i = 2; i < n; i++)
		{
			int counter = 0;

			if((n % i) == 0)
			{
				counter++;
				if (counter > 0) 
				{
					primeTF = true;
					break;
				}
			}
		}
		
		return primeTF;
	}
}