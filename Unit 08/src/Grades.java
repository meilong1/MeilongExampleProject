//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Grades
{
	//instance variables
	Scanner keyboard = new Scanner(System.in);
	int numGrade;
	int[] gradeArray;

	//constructor
	public Grades(){
		numGrade = keyboard.nextInt();
		gradeArray = new int[numGrade];
		for(int i = 0; i < gradeArray.length; i++){
			gradeArray[i] = keyboard.nextInt();
		}
		Arrays.sort(gradeArray);
	}


	//set method
	public void setGrades(){
		numGrade = keyboard.nextInt();
		gradeArray = new int[numGrade];
		for(int i = 0; i < gradeArray.length; i++){
			gradeArray[i] = keyboard.nextInt();
		}
		Arrays.sort(gradeArray);
	}


	private double getSum()
	{
		double sum=0.0;
		for(int i = 0; i < gradeArray.length; i++){
			sum += gradeArray[i];
		}


		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/gradeArray.length;


		return average;
	}


	
	//toString method
	public String toString(){
		String output = "";
		for(int i = 0; i < gradeArray.length; i++){
			output += "grade " + i + " :: " + gradeArray[i] + "\n";
		}
		output += "\n";
		output += "average = " + getAverage();
		return output;
	}


}