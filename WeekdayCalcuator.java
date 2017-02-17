import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Alec's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on " + weekday(date););
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";

		// bunch of calculations go here
		
		
		
		yy = yyyy - 1900;
		total = yy / 4 + yy + dd + month_offset(mm);
		if ((is_leap(int year) == true) && (mm == 1 || mm == 2))
		{
			total = total - 1;
		}
		
		total = total % 7;

		date = month_name(mm) + ", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
	
	public static int month_offset( int mm )
	{
		int offset_result;
		
		if (mm == 1) {offset_result = 1;}
		else if (mm == 2) {offset_result = 4;}
		else if (mm == 3) {offset_result = 4;}
		else if (mm == 4) {offset_result = 0;}
		else if (mm == 5) {offset_result = 2;}
		else if (mm == 6) {offset_result = 5;}
		else if (mm == 7) {offset_result = 0;}
		else if (mm == 8) {offset_result = 3;}
		else if (mm == 9) {offset_result = 6;}
		else if (mm == 10) {offset_result = 1;}
		else if (mm == 11) {offset_result = 4;}
		else if (mm == 12) {offset_result = 6;}
		else {offset_result = -1;}
		
		return offset_result;
	}
	
	public static String WeekdayName(total)
	
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}