//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		maze = new int[2][2];

	}

	public Maze(int size, String line)
	{
		String[] arrayString = line.split(" ");
		maze = new int[size][size];
		int iterator = 0;
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				maze[i][i] = Integer.parseInt(arrayString[iterator]);
				iterator++;
			}
		}
		

	}

	public boolean hasExitPath(int r, int c)
	{
		if(r <= maze[0].length && c <= maze[0].length && maze[r][c] == 1){
			maze[r][c] = 2;
		}
//		for(int i = 0; i < maze[0].length; i++){
//			for(int j = 0; j < maze[1].length; j++){
//				System.out.println(maze[i][j]);
//			}
//		}
		if(c == maze[1].length - 1){
			return true;
		}else{
			if(r + 1 <= maze[0].length && maze[r + 1][c] == 1){
				hasExitPath(r + 1, c);
			}else if(r - 1 >= 0 && maze[r - 1][c] == 1){
				hasExitPath(r - 1, c);
			}else if(c + 1 <= maze[1].length && maze[r][c + 1] == 1){
				hasExitPath(r, c + 1);
			}else if(c - 1 >= 0 && maze[r][c - 1] == 1){
				hasExitPath(r, c - 1);
			}
		}

		return false;
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i < maze[0].length; i++){
			for(int j = 0; j < maze[1].length; j++){
				if(maze[i][j] == 2){
					System.out.println(1 + " ");
				}else{
					System.out.print(maze[i][j] + " ");
				}
			}
			System.out.println();
		}
		if(hasExitPath(0, 0)){
			System.out.println("exit found");
		}else{
			System.out.println("exit not found");
		}




		return output;
	}
}