//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;
public class Grades
{
	private ArrayList <Double> grades;
	//private double[] grades;
	
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
		//System.out.println(gradeListArray.length);
		grades = new ArrayList<Double>(gradeListArray.length);
		
		for(int i = 0; i < gradeListArray.length; i++){
			grades.add(Double.parseDouble(gradeListArray[i]));
		}
		
//		for(int j = 0; j < grades.size(); j++){
//			System.out.println(grades.get(j));
//		}

	}
	
	public void setGrade(int spot, double grade)
	{
//		ArrayList<Double> newGrades = new ArrayList<Double>(grades.size() + 1);
//		for(int i = 0; i < grades.size(); i++){
//			newGrades.add(i, grades.get(i));
//		}
//		for(int i = newGrades.size() - 2; i > spot; i--){
//			newGrades.add(i, newGrades.get(i - 1));
//			
//		}
//		newGrades.add(spot, grade);
//		
//		grades = newGrades;
		grades.add(spot, grade);

	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i = 0; i < grades.size(); i++){
			sum += grades.get(i);
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(int i = 0; i < grades.size(); i++){
			if(grades.get(i) < low){
				low = grades.get(i);
			}
		}




		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(int i = 0; i < grades.size(); i++){
			if(grades.get(i) > high){
				high = grades.get(i);
			}
		}




		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		for(int i = 0; i < grades.size(); i++){
			output = output + grades.get(i) + " ";
		}




		return output;
	}	
}