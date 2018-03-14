//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		ArrayList<Class> school = new ArrayList<Class>();
		
		
		Scanner file = new Scanner(new File("H:\\Unit11\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));
		Class userclass;
		String className = file.nextLine();
		
		int classSize = Integer.parseInt(file.nextLine());
		userclass = new Class(className, classSize);
		String studentName = "";
		String studentGrades = "";
		//Student newStu = new Student();
		
		while(file.hasNext()){
			for(int i = 0; i < classSize; i++){
				Student newStu = new Student();
				studentName = file.nextLine();
				newStu.setName(studentName);
				studentGrades = file.nextLine();
				newStu.setGrades(studentGrades);
				userclass.addStudent(i, newStu);
			}
		}
		
		school.add(userclass);
		
		System.out.println(userclass);
		userclass.sort();
		System.out.println("Failure List = " + userclass.getFailureList(65));
		System.out.println("Highest Average = " + userclass.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + userclass.getStudentWithLowestAverage());
		System.out.println("Class average = " + userclass.getClassAverage());











	}		
}