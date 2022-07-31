import java.util.*;

class Student
{
	long Enrollment_No;
	String Student_Name;
	byte Semester;

	// Student s = new Student();

	void GetStudentDetails()
	{
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter Enrollment No : ");
		Enrollment_No = kz.nextLong();
		kz.nextLine();
		System.out.print("Enter student name : ");
		Student_Name = kz.nextLine();
		System.out.print("Enter Semester : ");
		Semester = kz.nextByte();
	}

	void displayStudentDetails()
	{
		System.out.println("Student Enrollment no : "+Enrollment_No);
		System.out.println("Student name is "+Student_Name);
		System.out.println("Semester is "+Semester);
	}
}

class Result
{
	long Enrollment_No;
	float CPI,SPI;

	void getResultDetails()
	{
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter Enrollment No : ");
		Enrollment_No = kz.nextLong();
		System.out.print("Enter student CPI : ");
		CPI = kz.nextFloat();
		System.out.print("Enter student SPI : ");
		SPI = kz.nextFloat();
	}

	public void displayResult(Student s)
	{
		s.displayStudentDetails();
		System.out.println("Student Enrollment no. is : "+Enrollment_No);
		System.out.println("CPI is "+CPI);
		System.out.println("SPI is "+SPI);
	}
}
class ObjClass1
{
	public static void main(String[] args) {
		

		Student s = new Student();
		s.GetStudentDetails();
		Result r = new Result();
		r.getResultDetails();

		r.displayResult(s);


	}
}