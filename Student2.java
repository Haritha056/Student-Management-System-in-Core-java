package Student;

import java.util.Scanner;

public class Student2 {

	public static void main(String[] args) 
	{
		System.out.print("Enter number of students to enroll:");
		Scanner  in = new  Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int n=0; n<numOfStudents; n++)
		{
			
			students[n]=new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		//create n number of new students
		for(int n=0; n<numOfStudents; n++)
		{
		System.out.println(students[n].toString());
		//System.out.println(students[1].toString());
		//System.out.println(students[2].toString());
		}


	}

}
