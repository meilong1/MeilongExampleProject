package unit3;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
		Quadratic quad1 = new Quadratic(5,-8,3);
		quad1.calcRoots();
		quad1.print();
		
		
		
		Quadratic quad2 = new Quadratic(1,1,1);
		quad2.setEquation(9, 6, 1);
		quad2.calcRoots();
		quad2.print();
		
		
		
		Quadratic quad3 = new Quadratic();
		quad3.calcRoots();
		quad3.print();
   	
		
		
	}
}