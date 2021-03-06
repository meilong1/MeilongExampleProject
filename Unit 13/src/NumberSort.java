//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int iterator = number;
		while(iterator != 0){
			iterator /= 10;
			count++;
		}

		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		
		
		// Put it all in the array
		int[] sorted = null;
		sorted = new int[getNumDigits(number)];
//		System.out.println(getNumDigits(number));
		for(int i = 0; i < sorted.length; i++){
			sorted[i] = number % 10;
			System.out.println(sorted[i]);
			number /= 10;
			System.out.println(number);
		}
		
		
		//Now we sort
		
		for(int a = 0; a < sorted.length; a++){
			
			for(int b = 0; b < sorted.length - 1; b++){
				if(sorted[b] > sorted[b + 1]){
					int temp = sorted[b + 1];
					sorted[b + 1] = sorted[b];
					sorted[b] = temp;
				}
			}
		}
		


		return sorted;
	}
}