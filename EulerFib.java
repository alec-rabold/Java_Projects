public class EulerFib
{
	public static void main(String[] args)
	{
		int fib = 420, prevFib1 = 1, prevFib2 = 0, sum = 0;
		
		while (fib < 4000000)
		{
			// f(n) = (n-2) + (n-1)
			fib = prevFib2 + prevFib1;
			
			if ((fib % 2) == 0)
			{
				sum = sum + fib;
			}
			
			prevFib2 = prevFib1; // shifts over one
			prevFib1 = fib;
			
		}
		System.out.println(sum);
	}
}