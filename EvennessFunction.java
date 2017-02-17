public class EvennessFunction 
{
	public static void main(String args[])
	{
		for(int i = 1; i <= 20; i++)
		{
			if(isItEven(i) && divisibleTwo(i))
			{
				System.out.println(i + " <=");
			}
			else if(isItEven(i))
			{
				System.out.println(i + " =");
			}
			else if(divisibleTwo(i))
			{
				System.out.println(i + " <");
			}
			else{System.out.println(i);}
			
		}
	}
	public static boolean isItEven(int n)
	{
		boolean evenTest = false;
		if((n % 2) == 0)
		{
			evenTest = true;
		}
		return evenTest;
	}
	public static boolean divisibleTwo(int n)
	{
		boolean divisibleTest = false;
		if((n % 3) == 0)
		{
			divisibleTest = true;
		}
		return divisibleTest;
	}
}