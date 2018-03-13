//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Class
{
	private String name;
	private ArrayList <Student> studentList;
	//private Student[] studentList;
	
	public Class()
	{
		name = "";
		studentList = new ArrayList<Student>(0);
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new ArrayList<Student>(stuCount);
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
//		Student[] newStudentList = new Student[studentList.length + 1];
//		for(int i = 0; i < studentList.length; i++){
//			newStudentList[i] = studentList[i];
//		}
//		for(int i = newStudentList.length - 1; i > stuNum; i--){
//			newStudentList[i] = newStudentList[i - 1];
//		}
//		newStudentList[stuNum] = s;
//		studentList = newStudentList;
		//studentList[stuNum] = s;
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for(int i = 0; i < studentList.size(); i++){
			classAverage += studentList.get(i).getAverage();
		}
		classAverage /= studentList.size();

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		double stuAverage = 0.0;
		stuAverage = studentList.get(stuNum).getAverage();
		return stuAverage;
	}

	public double getStudentAverage(String stuName)
	{
		double stuAverage = 0.0;
		for(int i = 0; i < studentList.size(); i++){
			if(getStudentName(i).equals(stuName)){
				stuAverage = studentList.get(i).getAverage();
			}
		}


		return stuAverage;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
//		double high = Double.MIN_VALUE;
//		String hName ="";
//		for(int i = 0; i < studentList.length; i++){
//			if(getStudentAverage(i) > high){
//				high = getStudentAverage(i);
//				hName = getStudentName(i);
//			}
//		}
		sort();




		return getStudentName(studentList.size() - 1);
	}

	public String getStudentWithLowestAverage()
	{
//		double low = Double.MAX_VALUE;
//		String hName ="";		
//		for(int i = 0; i < studentList.length; i++){
//			if(getStudentAverage(i) < low){
//				low = getStudentAverage(i);
//				hName = getStudentName(i);
//			}
//		}
		sort();




		return getStudentName(0);
	}
	
	public void sort(){
		for(int j = 0; j < studentList.size(); j++){
			for(int i = 0; i < studentList.size() - 1; i++){
				if(studentList.get(i).compareTo(studentList.get(i + 1)) == 1){
					Student temp = studentList.get(i);
					studentList.set(i, studentList.get(i + 1));
					studentList.set(i + 1, temp);
					
				}
			}
		}
	}
	
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i < studentList.size(); i++){
			if(getStudentAverage(i) < failingGrade){
				output = output + getStudentName(i) + " ";
			}
		}




		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for(int i = 0 ; i < studentList.size(); i++){
			//output += getStudentName(i) + " ";
			output += studentList.get(i);
			output += "\t" + getStudentAverage(i) + "\n";
		}



		return output;
	}  	
}