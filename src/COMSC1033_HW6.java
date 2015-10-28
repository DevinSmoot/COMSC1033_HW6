/*Project:		Addition game
 *Date:			2015-10-11
 *Author:		Devin Smoot
 *Class:		COMSC1033
 */
import java.util.Scanner;
public class COMSC1033_HW6 {
	public static void main(String[] args) {
		//Define variables
		int number1;
		int number2;
		int score = 0;
		int hardnessOfQuestion = 10;
		int studentAnswer;
		int correctAnswer;
		//State game name and rules
		System.out.println ("Let's play an addition game!");
		System.out.println ("There will be four rounds of increasing difficulty.");
		System.out.println ("If a question is answered incorrectly the difficulty will decrease.");
		
		//Set up a for loop for all four rounds
		for (int i = 0; i < 4; i++)
		{
		//	Generate 2 random numbers
		number1 = (int)(Math.random() * hardnessOfQuestion);
		//System.out.println("Number1 is :" + number1 );
		number2 = (int)(Math.random() * hardnessOfQuestion);
		//System.out.println("Number2 is :" + number2 );
		correctAnswer = number1 + number2;
		//  Ask the user to add these two numbers together
		System.out.println("\nWhat is " + number1 + " + " + number2 + "?");
		//  Read in their response
		Scanner input = new Scanner(System.in);
		//Take input and validate that input is an integer
		 do {
			 while (!input.hasNextInt()) {
		            System.out.println("That's not a number! Please enter a number.");
		            input.next(); // this is important!
		        }
		        studentAnswer = input.nextInt();
		    } while (studentAnswer <= 0);
		//  Check if the answer was correct
		//	IF correct
		if (studentAnswer == correctAnswer){
			//State that answer is correct
			System.out.println("Answer was correct");
			//Add points
			score += 2;
			//Show score
			System.out.println("Two points gained!");
			System.out.println("Score: " + score);
			//Increase hardness of the question
			hardnessOfQuestion *= 10;
		}else{
			//State that answer is incorrect
			System.out.println("Answer was not correct");
			//Remove points
			score -= 1;
			//Show score
			System.out.println("The correct answer was: " + correctAnswer);
			System.out.println("A point was lost!");
			System.out.println("Score: " + score);
			//Decrease hardness of the question while checking to make sure
			//it is at always 10 at the lowest level.
			if (hardnessOfQuestion == 10){
				hardnessOfQuestion = 10;
			}else{
				hardnessOfQuestion /= 10;
			}
		}
	}
	System.out.println ("\nThanks for playing!");
	System.out.println ("Your final score is: " + score);
	}
}
