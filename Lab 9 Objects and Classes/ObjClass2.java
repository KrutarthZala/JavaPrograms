import java.util.*;

class Student_Detail
{
	long Enrollment_No;
	String Name;
	byte sem;
	float CPI;

	void getStudentDetails()
	{
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter Enrollment No : ");
		Enrollment_No = kz.nextLong();
		kz.nextLine();
		System.out.print("Enter student name : ");
		Name = kz.nextLine();
		System.out.print("Enter student semester : ");
		sem = kz.nextByte();
		System.out.print("Enter your CPI : ");
		CPI = kz.nextFloat();
	}

	void displayStudentDetails()
	{
		System.out.println("Your enrollment number is "+Enrollment_No);
		System.out.println("Your name is "+Name);
		System.out.println("Your semester is "+sem);
		System.out.println("Your CPI is "+CPI);
	}
}
class ObjClass2
{

	public static void main(String[] args) {
		
		Student_Detail []s = new Student_Detail[5];

		for (int i = 0 ;i < 5 ; i++ ) 
		{
			s[i] = new Student_Detail();
			s[i].getStudentDetails();
		}
		for (int i = 0 ;i < 5 ; i++ ) 
		{
			s[i].displayStudentDetails();
		}
	}
}