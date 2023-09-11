/*
 * Class: CMSC203 
 * Instructor: Professor Kuijt
 * Description: Assignment #1
 * Due: 09/10/23
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: __James Malca______
*/

import java.util.Scanner;
import java.util.Random;

public class esp {

	public static void main(String[] args) {
		
		//values
		
		final String COLOR_RED = "Red";
		
		final String COLOR_GREEN = "Green";
		
		final String COLOR_BLUE = "Blue";
		
		final String COLOR_ORANGE = "Orange";
		
		final String COLOR_YELLOW = "Yellow";
		
		final String COLOR_BROWN = "Brown";
		
		final String COLOR_PINK = "Pink";
		
		String color = "";
		//initialize scanner
		Scanner input = new Scanner(System.in);
		//Initial menu
		System.out.print("Enter your name: ");
		
		String name = input.nextLine();
		
		System.out.print("Describe yourself: ");
		
		String description = input.nextLine();
		
		System.out.print("Due date: ");
		
		String date = input.nextLine();
		
		System.out.println("CMSC203 Assignment1: Test your Esp skills!");
	
		//counter for correct answers
		int correctAns = 0;
		//while loop to run 10 times then stops
		
		int i = 1;
		
		while (i < 11) {
			
			System.out.println("Round " + i + "\n\n");
			
			System.out.println("I am thinking of a color.");
			
			System.out.println("Is it Red, Green, Blue, Orange, Yellow, Brown, or Pink?");
			
			System.out.println("Enter your guess:");
			//creates a random color
			Random random = new Random();
			
			int randNum = random.nextInt(7);
		
			if (randNum == 0)
				color = COLOR_RED;
			else if (randNum == 1)
				color = COLOR_GREEN;
			else if (randNum == 2)
				color = COLOR_BLUE;
			else if (randNum == 3)
				color = COLOR_ORANGE;
			else if (randNum == 4)
				color = COLOR_YELLOW;
			else if (randNum == 5)
				color = COLOR_BROWN;
			else if (randNum == 6)
				color = COLOR_PINK;
		
			//user answer	
			String answer = input.nextLine();
			//compares answer to see if the answer matches the random generated color
			if (answer.equalsIgnoreCase(color))
			{
				System.out.println("I was thinking of " + color);
				correctAns++; // adds to correct answer color if correct
			}
			else 
			{
				System.out.println("You entered the incorrect color");
				System.out.println("I was thinking of " + color);
			}
				
				
			i++;
				
		}
		//Ending message
		System.out.println("Game over \n");
		
		System.out.println("You guessed " + correctAns + " out of 10 colors correctly.");
		
		System.out.println("User name: " + name);
		
		System.out.println("User description: " + description);
		
		System.out.println("Due Date: " + date);
	}
	
}
	

	

	
