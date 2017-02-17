public class MultiplicationTable
{
	public static void main(String args[])
	{
		System.out.println("x | 1	2	3	4	5	6	7	8	9	10");
		System.out.println("===+=========================================================================");
		
		for(int i = 0; i < 12; i++)
		{
			System.out.print((i+1) + " | ");
			for(int j = 0; j < 10; j++)
			{
				System.out.print((i+1) * (j+1) + "	");
			}
		}
	}
}