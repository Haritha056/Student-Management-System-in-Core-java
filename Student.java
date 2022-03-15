package Student;


import java.util.Scanner;

public class Student 
{
	private String firstName;
	private String lastName;
	private String gradeYear;
	private int studentId;
	private String courses="java" ;
	private int tuitionBalance = 1000;
	private String studentID;
	private static int costOfCourse=600;
	private static int id = 10000;
	
	
	public Student() 
	{
		
		
			Scanner in = new Scanner(System.in);
			System.out.println("Enter student first name :");
			this.firstName = in.nextLine();
			
			System.out.println("Enter student last name :");
			this.lastName = in.nextLine();
			
			System.out.print("1) Newstudent \n 2)Currently pursing \n Enter student class level :");
			this.gradeYear = in.nextLine();
			
			setStudentID();
			System.out.println(firstName + " "+ lastName +" "+ gradeYear+" "+studentID);
			
			
	}
	private  void setStudentID()
	{
		
			
			System.out.println("Enter student id");
			id++;
			this.studentID= gradeYear + ""+ id;

	}
	public void enroll() 
	{
		do 
		{
			System.out.println("Enter course to enroll (Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
	
			if(!course.equals("Q"))
			{
			course=course + "\n" + course;
			tuitionBalance = tuitionBalance+costOfCourse;
			}
			else
			{
				System.out.println("BREAK!");
				break;
			}
		}while(1!=0);
		
						
	}
	//view Balance
	public void viewBalance() 
	{
		
		System.out.println("Your balance is :$" +tuitionBalance);
	
	}
	//pay tuition
	public void payTuition()
	{
			viewBalance();
			System.out.println(("Enter your payment :$"));
		    Scanner in = new Scanner(System.in);
		    int payment = in.nextInt();
		    tuitionBalance = tuitionBalance-payment;
		    System.out.println("Thankyou for your payment of $"+payment);
		    viewBalance();

			
		}
	
		// Show status
	public String toString()
	{
		return "Name: "+firstName + " "+lastName+
				"\n Grade Level: "+ gradeYear+
				"\n Student ID :"+ studentID+
				"\nCourses Enrolled :"+courses+
				"\nBalance: $"+ tuitionBalance;
		
	}
}

			
			

	
		
	
		
					


		
	


