public class NumberPuzzle
{
	public static void main(String args[])
	{
		final int DOUBLEDIGITS = 10;
		final int UPPERBOUND = 51;
		
		for(int i = DOUBLEDIGITS; i < UPPERBOUND; i++)
		{
			for(int j = DOUBLEDIGITS; j < UPPERBOUND; j++)
			{
				if(((i + j) == 60) && (((i-j) == 14) || ((i-j) == (-14))))
				{
					System.out.println(i + " and " + j);
				}
			}
		}
	}
}