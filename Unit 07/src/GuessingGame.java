//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		
		if(upperBound < 2){
			System.out.println("Range is too small.");
			toString();
		}
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
		int answer = rng.nextInt(upperBound - 1) + 1;
		int userGuess;
		int guessCounter = 0;
		do{
			System.out.print("Enter a number between 1 and " + upperBound + " ");
			userGuess = keyboard.nextInt();
			if(userGuess < 1 || userGuess > upperBound){
				System.out.println("Number out of range!");
			}
			guessCounter++;
		}while(answer != userGuess);
		System.out.println("It took " + guessCounter + " guesses to guess " + answer);
		int stats = ((guessCounter - 1) * 100 / upperBound);
		System.out.println("You guessed wrong " + stats + " percent of the time.");
	}

	public String toString()
	{
		String output = "Do you want to play again?";
		return output;
	}
}