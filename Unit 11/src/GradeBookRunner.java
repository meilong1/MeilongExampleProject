//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		String classname = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the name of your class?");
		classname = keyboard.nextLine();
		System.out.println("How many students are in your class?");
		int stuNum = keyboard.nextInt();
		keyboard.nextLine();
		
		Class myClass = new Class(classname, stuNum);
		String studentname = "";
		String gradeList = "";
		int intprinter = 0;
		for(int i = 0; i < stuNum; i++){
			intprinter = i + 1;
			System.out.println("What is the name of student " + intprinter);
			studentname = keyboard.nextLine();
			System.out.println("What are the grades for student " + intprinter);
			gradeList = keyboard.nextLine();
			Student newStudent = new Student(studentname, gradeList);
			myClass.addStudent(i, newStudent);
			
		}
		myClass.sort();
		System.out.println("Failure List = " + myClass.getFailureList(65));
		System.out.println("Highest Average = " + myClass.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + myClass.getStudentWithLowestAverage());
		System.out.println("Class average = " + myClass.getClassAverage());

















	}		
}