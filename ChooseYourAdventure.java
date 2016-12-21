import java.util.Scanner;

public class ChooseYourAdventure
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answerOne, answerTwo, answerThree;
		
		System.out.println("WELCOME TO ALEC'S TINY ADVENTURE!");
		System.out.println("\nYou are in a creepy house! Would you like to go " +
			"\"upstairs\" or into the \"kitchen\"?");
		answerOne = keyboard.next();
		
		if (answerOne.equals("kitchen")) // First choice: kitchen
		{
			System.out.println("There is a long countertop with dirty dishes everywhere. " +
				"Off to one side there is, as you'd expect, a refrigerator. You may open" +
				" the \"refrigerator\" of look in the \"cabinet\".");
			answerTwo = keyboard.next();
			
			if (answerTwo.equals("refrigerator")) // Second choice: refrigerator
			{
				System.out.println("Inside the refrigerator you see food and stuff. It looks " +
					"pretty nasty. Would you like to eat some of the food? (yes/no)");
				answerThree = keyboard.next();
					if (answerThree.equals("yes")) // Third choice: yes, eat the food
					{
						System.out.println("Sorry. Unfortunately the food was well past " +
							"its expiration date and you did not make it out alive.");
					}
					if (answerThree.equals("no")) // Third choice: no, don't eat the food
					{
						System.out.println("Congratulations. Your better judgements have kept " +
							"you alive this time.");
					}
			}
			if (answerTwo.equals("cabinet")) // Second choice: cabinet
			{
				System.out.println("Inside the cabinet, there's a pile of books and decorations. " +
					"You move these to the side and find a trapdoor. Would you like to \"leave\" " +
					"the closet or \"enter\" the trapdoor");
				answerThree = keyboard.next();
					if (answerThree.equals("leave")) // Third choice: leave
					{
						System.out.println("Congratulations, your better judgements have kept " +
							"you alive this time.");
					}
					if (answerThree.equals("enter")) // Third choice: enter
					{
						System.out.println("Unfortunately, it was a trap. You did not make it " +
							"out alive.");
					}
			}
		}
		if (answerOne.equals("upstairs")) // First choice: upstairs
		{
			System.out.println("Upstairs you see a hallway. At the end of the hallway is " +
				"the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where " +
				"would you like to go?");
			answerTwo = keyboard.next();
			if (answerTwo.equals("bedroom")) // Second choice: bedroom
			{
				System.out.println("You see a plush bed. You sit down and within minutes, you " +
					"fall asleep...");
			}
			if (answerTwo.equals("bathroom")) // Second choice: bathroom
			{
				System.out.println("You see a window, and your animal instincts tell you " +
					"to leave the house. You exit and live happily ever after.");
			}
		}
	}
}