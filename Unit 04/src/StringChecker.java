//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "ken";

	}

	public StringChecker(String s)
	{
		word = s;

	}

   public void setString(String s)
   {
   		word = s;
   }

	public boolean findLetter(char c)
	{
		int location = word.indexOf(c);
		if(location != -1){
			return true;
		}

		return false;
	}

	public boolean findSubString(String s)
	{
		int location = word.indexOf(s);
		if(location != -1){
			return true;
		}


		return false;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}