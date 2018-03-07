//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("hello", 'e');
	}

	public LetterRemover(String s, char rem){
		sentence = s;
		lookFor = rem;
	}
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence;
		while(cleaned.indexOf(lookFor) >= 0){
			for(int i = 0; i < cleaned.length(); i++){
				if(cleaned.charAt(i) == lookFor){
					cleaned = cleaned.substring(0,i) + cleaned.substring(i+1,cleaned.length());
				}
			}
		}




		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}