//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File("H:\\Unit14_2016\\Unit14_2016\\Unit14-Assignments\\lab21i.dat"));
		int size = 0;
		//while(file.hasNext()){
			size = file.nextInt();
			file.nextLine();
			Maze maze = new Maze(size, file.nextLine());
			System.out.println(maze);
		//}
		
	}
}