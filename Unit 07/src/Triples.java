//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		for(int i = 1; i < a; i++){
			if(b % i == 0 && c % i == 0 && a % i == 0){
				max = i;
			}
		}


		return max;
	}

	public String toString()
	{
		String output="";
		for(int x = 1; x < number; x++){
			for(int y = x; y < number; y++){
				for(int z = 1; z < number; z++){
					if(Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)){
						if(z % 2 != 0 && ((x % 2 != 0 && y % 2 == 0) || (x % 2 == 0 && y % 2 != 0))){
							if(greatestCommonFactor(x, y, z) == 1){
								output += x + " " + y + " " + z + "\n";
							}
						}
					}
				}
			}
		}





		return output+"\n";
	}
}