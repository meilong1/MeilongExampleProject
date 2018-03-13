//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}

	public int compareTo( Word rhs )
	{
		String rhsstring = rhs.toString();
		if(word.length() > rhsstring.length()){
			return 1;
		}else if(word.length() < rhsstring.length()){
			return -1;
		}else{
			for(int i = 0; i < word.length(); i++){
				if(word.charAt(i) < rhsstring.charAt(i)){
					return -1;
				}else if(word.charAt(i) > rhsstring.charAt(i)){
					return 1;
				}
			}
		}
		return 0;
		
	}

	public String toString()
	{
		String output = "";
		output = word;
		return output;
	}
}