//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		char response;
		do{
			Scanner keyboard = new Scanner(System.in);
			
			int stop;
			System.out.print("Guessing Game - how many numbers?");
			stop = keyboard.nextInt();
			GuessingGame gg = new GuessingGame(stop);
			gg.playGame();
			System.out.print(gg.toString());
			response = keyboard.next().charAt(0);
		}while(response == 'y');
		



	}
}