package unit3;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		Distance dist1 = new Distance(1,1,2,1);
		dist1.calcDistance();
		dist1.print();
		Distance dist2 = new Distance(0,0,0,0);
		
		System.out.println();
		
		dist2.setCoordinates(1, 1, -2, 2);
		dist2.calcDistance();
		dist2.print();
		
		System.out.println();
		
		Distance dist3 = new Distance();
		dist3.calcDistance();
		dist3.print();
		
		
			
	}
}