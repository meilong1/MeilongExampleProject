//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable <Student>
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		myName = "";
		myGrades = new Grades("5 - 78 99 69 42 66");
	}
	
	public Student(String name, String gradeList)
	{
		this();
		setName(name);
		myGrades = new Grades(gradeList);


	}
	
	public void setName(String name)
	{
		myName = name;

	}	
	
	public void setGrades(String gradeList)
	{
		myGrades.setGrades(gradeList);
	
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		double a = getSum()/getNumGrades();
		//return Math.round(a * 100) / 100;
		return Double.parseDouble(String.format("%.2f", a));
	}

	public double getAverageMinusLow()
	{
		return (getSum() - getLowGrade())/(getNumGrades() - 1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
//	public boolean compareTo(Student student2){
//		if(getAverage() > student2.getAverage()){
//			return true;
//		}else{
//			return false;
//		}
//	}
	public int compareTo(Student param){
		if(getAverage() > param.getAverage())
			return 1;
		else if(getAverage() < param.getAverage())
			return -1;
		return 0;
	}
	
	
	
	public String toString()
	{
		String toreturn = myName + " = " + myGrades;
		return toreturn;
		
	}	
}