import java.util.Scanner;

public class BMICategories
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int height_meters, weight_kg;
		double BMI;
		String BMI_category;
		
		BMI_category = "";
		
		System.out.println("Your height in m: ");
		height_meters = keyboard.nextInt();
		
		System.out.println("You weight in kg: ");
		weight_kg = keyboard.nextInt();
		
		BMI = (weight_kg/(height_meters*height_meters));
		
		System.out.println("Your BMI is " + BMI);
		
		if (BMI < 18.5)	
		{
			BMI_category = "underweight";
		}
		if (BMI >= 18.5 && BMI < 25)	
		{
			BMI_category = "normal weight";
		}
		if (BMI >= 25 && BMI < 30)
		{
			BMI_category = "overweight";
		}
		if (BMI >= 30)	
		{
			BMI_category = "obese";
		}
		
		System.out.println("BMI Category: " + BMI_category);
	}
}