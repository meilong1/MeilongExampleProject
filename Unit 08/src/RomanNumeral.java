//© A+ Computer Science  -  www.apluscompsci.com
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

//	public int getNumber()
//	{
//		number = 0;
//                for(int i = 0; i < roman.length(); i++){
//                    if (i + 1 < roman.length()) {
//                        String rchar = roman.substring(i, i + 2);
//                        int num = romanToInt(rchar);
//                        if (num == -1) {
//                            rchar = roman.substring(i, i + 1);
//                            num = romanToInt(rchar);
//                        } else {
//                            i++;
//                        }
//                        number += num;
//                    } else {
//                        String rchar = roman.substring(i, i + 1);
//                        int num = romanToInt(rchar);
//                        number += num;
//                    }
//                }
//                return number;
//	}
//	
//	
//	
//        
//        private int romanToInt(String rom) {
//            for (int i = 0; i < LETTERS.length; i++) {
//                if (LETTERS[i].equals(rom)) {
//                    return NUMBERS[i];
//                }
//            }
//            return -1;
//        }
        
	
	public int getNumber(){
		number = 0;
		String comprom;
		boolean isTwo = true;
		while(roman.length() != 0){
			if(roman.length() > 2 && isTwo){
				comprom = roman.substring(0,2);
				
			}else{
				comprom = roman.substring(0,1);
			}
			
			for(int i = 0; i < LETTERS.length; i++){
				if(LETTERS[i].equals(comprom)){
					number += NUMBERS[i];
					roman = roman.substring(comprom.length());
					isTwo = true;
					break;
				}else{
					isTwo = false;
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
