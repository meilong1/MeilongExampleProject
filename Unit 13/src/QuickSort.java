//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(int[] list)
	{
		quickSort(list, 0, list.length - 1);



	}


	private static void quickSort(int[] list, int low, int high)
	{
		
		int split;
		if(low < high){
			split = partition(list, low, high);
			quickSort(list, low, split);
			quickSort(list, split + 1, high);
			
		}
		System.out.println("pass " + passCount + " " + Arrays.toString(list));
		passCount++;

	}


	private static int partition(int[] list, int low, int high)
	{
		int pivot = list[low];
		int bot = low - 1;
		int top = high + 1;
		
		while(bot < top){
			while(list[--top] > pivot){
				
			}
			while(list[++bot] < pivot){
				
			}
				
			
			
				
			
			if(bot >= top){
				return top;	
			}
			int temp = list[bot];
			list[bot] = list[top];
			list[top] = temp;
		}

		
		return 0;
	}
}