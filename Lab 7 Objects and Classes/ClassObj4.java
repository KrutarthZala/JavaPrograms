import java.util.*;

class Student
{
	long Enrollment_No;
	String Student_Name;
	byte Semester;
	float CPI,SPI;

	public void GetStudentDetails()
	{
		Scanner kz = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		
		System.out.print("Enter student enrollment no : ");
		Enrollment_No = kz.nextLong();
		System.out.print("Enter student name : ");
		Student_Name = str.nextLine();
		System.out.print("Enter student semester : ");
		Semester = kz.nextByte();
		System.out.print("Enter student CPI : ");
		CPI = kz.nextFloat();
		System.out.print("Enter student SPI : ");
		SPI = kz.nextFloat();
	}

	public void DisplayStudentDetails()
	{
		System.out.println("Student enrollment no : "+Enrollment_No);
		
		System.out.println("Student name : "+Student_Name);
	
		System.out.println("Student semester : "+Semester);
		
		System.out.println("Student CPI : "+CPI);
		
		System.out.println("Student SPI : "+SPI);
		
	}
}

class ClassObj4
{
	public static void main(String[] args) {
		
		System.out.print("Enter below details of student.\n");

		Student detail = new Student();

		detail.GetStudentDetails();

		System.out.print("Student details are shown below.\n");

		detail.DisplayStudentDetails();


	}
}