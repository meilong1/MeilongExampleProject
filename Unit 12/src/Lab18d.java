//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.ArrayList;
public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit12-2016\\Unit12-2016\\Unit12-Assignments\\lab18d\\lab18d.dat"));

		int size = file.nextInt();
		ArrayList<Word> list = new ArrayList<Word>();
		
		for(int i = 0; i <= size; i++){
			list.add(new Word(file.nextLine()));
		}
//		for(int j = 0; j < list.size(); j++){
//			System.out.println(list.get(j));
//		}
		for(int z = 0; z < list.size(); z++){
			for(int j = 0; j < list.size() - 1; j++){
				if(list.get(j).compareTo(list.get(j + 1)) == 1){
					Word temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		for(int a = 0; a < list.size(); a++){
			System.out.println(list.get(a));
		}
		
		
		
		
		
		
		











	}
}