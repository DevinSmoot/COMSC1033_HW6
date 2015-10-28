# Project Name: Addition Game
    Date:			2015-10-11
    Author: 		Devin Smoot
    Class:		    COMSC1033
 
##  Introduction:
 This week we worked on a game involving 4 rounds. Each round has increasing difficulty as long as a correct answer is entered. Points are added once a correct answer is given. If an incorrect answer is given then the difficulty is decreased as well as the score.
 
## Code:
```java
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
```

## Console Output (No errors):
```
Let's play an addition game!
There will be four rounds of increasing difficulty.
If a question is answered incorrectly the difficulty will decrease.

What is 2 + 4?
6
Answer was correct
Score: 2

What is 26 + 87?
113
Answer was correct
Score: 4

What is 579 + 626?
256
Answer was not correct
Score: 3

What is 83 + 27?
100
Answer was not correct
Score: 2

Thanks for playing!
Your final score is: 2
```

## Console output (With errors):
```
Let's play an addition game!
There will be four rounds of increasing difficulty.
If a question is answered incorrectly the difficulty will decrease.

What is 3 + 6?
9
Answer was correct
Score: 2

What is 57 + 83?
140
Answer was correct
Score: 4

What is 774 + 975?
a
That's not a number! Please enter a number.
1749
Answer was correct
Score: 6

What is 2114 + 5954?
12.65
That's not a number! Please enter a number.
266
Answer was not correct
Score: 5

Thanks for playing!
Your final score is: 5
```

## Summary:
This week’s assignment allowed me to utilize FOR loops. I also go to validate input to verify it was an actual integer and not something else such as a letter or decimal. By utilizing the FOR loop allowed me to shrink the entire size of the program. As I could have 4 duplicate rounds or 1 round that increases the needed variables as it goes. Being able to validate the integer on input allows me to eliminate input instructions and keep the program from crashing. 

So a step by step of the program is as follow:

    1.  The integers are initiated and set
    2.	Game is described as well as rules.
    3.	The FOR loop begins (limited to 4 rounds)
    4.	Number1 is randomized based on hardnessOfQuestion
    5.	Number2 is randomized based on hardnessOfQuestion
    6.	CorrectAnswer is calculated by adding the two numbers together. This will be used to evaluate the users answer later on.
    7.	A DO loop is used to take the input from the user. It is then validated. If it fails then it takes a new input and validates again until a good integer is input.
    8.	An IF statement is next utilized to evaluate the users answer against the correctAnswer.
    9.	If a correct answer is given then points are added and hardnessOfQuestion is increased.
    10.	If an incorrect answer is given then points are taken away and hardnessOfQuestion is decreased. If hardnessOfQuestion is already 10 then it stays at 10.
    11.	This loops and continues for all four rounds.
    12.	At the end of all four rounds a message thanking the player for playing and a final score is printed.
