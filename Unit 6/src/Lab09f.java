//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover lr = new LetterRemover("I am proud to be a bonobo.", 'o');
		
		System.out.println(lr.toString());
		System.out.println(lr.removeLetters());
		
		LetterRemover lr2 = new LetterRemover("My name is Tygan and I am a filthy support main.", 'a');
		lr2.setRemover("My name is Tygan and I am a filthy Darius main.", 'a');
		System.out.println(lr2.toString());
		System.out.println(lr2.removeLetters());
											
	}
}