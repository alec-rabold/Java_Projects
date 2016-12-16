public class Variables_and_Printing
{
	public static void main(String[] args)
	{
		String myName, myEyes, myTeeth;
		int myAge, myHeight, myWeight;
		
		myName = "Alec T. Rabold";
		myAge = 18;
		myHeight = 71; // inches
		myWeight = 145; // lbs
		myEyes = "Blue/Green";
		myTeeth = "White";
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches tall.");
		System.out.println("He's " + myWeight + " pounds heavy");
		System.out.println("Acutally, that's not too heavy..");
		System.out.println("He's got " + myEyes + " eyes.");
		System.out.println("His teeth are usually " + myTeeth + " depending on the shaved ice..");
		
		// This line will be a bit more complex
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " 
			+ (myAge + myHeight + myWeight) + ".");
	}
}