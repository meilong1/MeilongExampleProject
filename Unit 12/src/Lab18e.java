//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit12-2016\\Unit12-2016\\Unit12-Assignments\\lab18e\\lab18e.dat"));
		ArrayList<Word2> myWords = new ArrayList<Word2>();
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++){
			myWords.add(new Word2(file.nextLine()));
		}
		for(int j = 0; j < myWords.size(); j++){
			for(int z = 0; z < myWords.size() - 1; z++){
				if(myWords.get(z).compareTo(myWords.get(z + 1)) == 1){
					Word2 temp = myWords.get(z + 1);
					myWords.set(z + 1, myWords.get(z));
					myWords.set(z, temp);
				}
			}
		}
		for(int a = 0; a < myWords.size(); a++){
			System.out.println(myWords.get(a));
		}








	}
}