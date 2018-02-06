package unit3;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a :: ");
		a = keyboard.nextInt();
		System.out.println("Enter b :: ");
		b = keyboard.nextInt();
		System.out.println("Enter c :: ");
		c = keyboard.nextInt();

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

 	}

	public void calcRoots( )
	{
		rootOne = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
		rootTwo = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);

	}

	public void print( )
	{
		System.out.printf("rootone :: %.2f\n" , rootOne);
		System.out.printf("roottwo :: %.2f\n" , rootTwo);

	}
}