//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;


	}

	public RomanNumeral(Integer orig)
	{

		number = orig;

	}

	public void setNumber(Integer num)
	{

		number = num;



	}

	public void setRoman(String rom)
	{
		roman = rom;


	}

	public int getNumber()
	{
		number = 0;
		
		while(!roman.equals("")){
		for(int i = 0; i < LETTERS.length; i++){
			if(roman.length() <= 2){
				if(LETTERS[i].equals(roman.substring(0,1))){
					number += NUMBERS[i];
					roman = roman.substring(1,roman.length());
				}
			}else if(LETTERS[i] == roman.substring(0,2)){
				number += NUMBERS[i];
				roman = roman.substring(2,roman.length());
				
			}
		}
	}
		return number;
	}
	public String toString()
	{
		roman = "";
		for(int i = 0; i < NUMBERS.length; i++){
			while(number - NUMBERS[i] >= 0){
				roman += LETTERS[i];
				number -= NUMBERS[i];
			}
		}
		return roman + "\n";
	}
}