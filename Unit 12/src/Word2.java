//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		word = s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i = 0; i < word.length(); i++){
			for(int j = 0; j < vowels.length(); j++){
				if(word.charAt(i) == vowels.charAt(j)){
					vowelCount++;
				}
			}
		}






		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{
		String checker = rhs.toString();
		if(numVowels() < rhs.numVowels()){
			return -1;
		}else if(numVowels() > rhs.numVowels()){
			return 1;
		}else{
			for(int a = 0; a < word.length(); a++){
				if(word.charAt(a) < checker.charAt(a)){
					return -1;
				}else if(word.charAt(a) > checker.charAt(a)){
					return 1;
				}
			}
			
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}

	
}