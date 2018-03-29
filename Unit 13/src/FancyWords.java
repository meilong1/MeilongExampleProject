//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private char[][] wordRay;

	public FancyWords(String sentence)
	{
		int largestWord = 0;
		String[] stringArray = sentence.split(" ");
		for(int i = 0; i < stringArray.length; i++){
			if(stringArray[i].length() > largestWord){
				largestWord = stringArray[i].length();
			}
		}
		//System.out.println(largestWord);
		wordRay = new char[largestWord][stringArray.length];
		//System.out.println(wordRay[0].length);
		//System.out.println(stringArray[3]);
		int rayx = 0;
		int rayy = 0;
		for(int i = stringArray.length - 1; i >= 0; i--){
			rayx = 0;
			
			for(int j = stringArray[i].length() - 1; j >= 0; j--){
				wordRay[rayx][rayy] = stringArray[i].charAt(j);
				rayx++;
			}
			rayy++;
		}
		//wordRay[4][0] = 'N';
		//System.out.println(wordRay[0].length);
//		for(int a = 0; a < wordRay[0].length; a++){
//			for(int b = 0; b < wordRay[1].length; b++){
//				System.out.print(wordRay[a][b]);
//			}
//			System.out.println();
//		}
		
	}

	public void setWords(String sentence)
	{
		
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		
		for(int a = 0; a < wordRay[0].length; a++){
			for(int b = 0; b < wordRay[1].length; b++){
				output += wordRay[a][b];
			//	System.out.print(wordRay[a][b]);
			}
			//System.out.println();
			output += "\n";
		}




		return output+"\n\n";
	}
}