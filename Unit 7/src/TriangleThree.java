//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output = "";
		for(int i = 0; i < size + 1; i++){
			int b = 0;
			for(int j = 0; j < i; j++){
				
				for(int z = b; z < size - i; z++){
					output += " ";
					b++;
				}
				output += letter;
			}
			output += "\n";
		}
		return output;
	}
}