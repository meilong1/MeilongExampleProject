//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		gradeList = gradeList.substring(4);
		String[] gradeListArray = gradeList.split(" ");
		grades = new double[gradeListArray.length];
		for(int i = 0; i < grades.length; i++){
			grades[i] = Double.parseDouble(gradeListArray[i]);
		}


	}
	
	public void setGrade(int spot, double grade)
	{
		double[] newGrades = new double[grades.length + 1];
		for(int i = 0; i < grades.length; i++){
			newGrades[i] = grades[i];
		}
		for(int i = newGrades.length - 1; i > spot; i--){
			newGrades[i] = newGrades[i - 1];
		}
		newGrades[spot] = grade;
		grades = newGrades;

	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i = 0; i < grades.length; i++){
			sum += grades[i];
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(int i = 0; i < grades.length; i++){
			if(grades[i] < low){
				low = grades[i];
			}
		}




		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(int i = 0; i< grades.length; i++){
			if(grades[i] > high){
				high = grades[i];
			}
		}




		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";
		for(int i = 0; i < grades.length; i++){
			output = output + grades[i] + " ";
		}




		return output;
	}	
}