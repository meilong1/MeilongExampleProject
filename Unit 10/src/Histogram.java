//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();



	}

	public Histogram(char[] values, String fName)
	{
		this();
		for(int i = 0; i < values.length; i++){
			letters.add(values[i]);
		}
		fileName = fName;





		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16e\\" + fileName));
		String s;
		int counter;
		for(int i = 0; i < letters.size(); i++){
			counter = 0;
			
			// ERROR ALERT
			// FILE MUST BE RESET EVERYTIME OR B AND C WILL NOT BE COUNTED
			
			
			
			
			
			while(file.hasNext()){
				s = file.next();
				for(int j = 0; j < s.length(); j++){
					if(s.charAt(j) == letters.get(i)){
						counter++;
					}
				}
			}
			count.add(counter);
		}
			
		






	}

	public char mostFrequent()
	{

		return '#';
	}

	public char leastFrequent()
	{


		return '#';
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}