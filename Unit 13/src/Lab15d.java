//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit13-2016\\Unit13-Assignments\\lab15d.dat"));
		file.nextLine();
		FancyWords fw = new FancyWords(file.nextLine());
		System.out.println(fw);



	}
}