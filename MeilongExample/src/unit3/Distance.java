package unit3;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();


	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;


	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow((xTwo - xOne), 2) + Math.pow((yTwo - yOne), 2));


	}

	public void print( )
	{
		System.out.printf("distance == %.3f\n", distance);


	}
}