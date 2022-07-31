import java.util.*;

class Employee
{
	int Employee_ID;
	String Employee_Name,Designation;
	short Age;
	float Salary;

	public void GetEmployeeDetails()
	{
		Scanner kz = new Scanner(System.in);
		Scanner str = new Scanner(System.in);

		System.out.print("Enter employee id : ");
		Employee_ID = kz.nextInt();
		System.out.print("Enter employee name : ");
		Employee_Name = str.nextLine();
		System.out.print("Enter employee designation : ");
		Designation = str.nextLine();
		System.out.print("Enter employee age : ");
		Age = kz.nextShort();
		System.out.print("Enter employee salary : ");
		Salary = kz.nextFloat();
	}

	public void DisplayEmployeeDetails()
	{
		System.out.println("Employee id : "+Employee_ID);
		
		System.out.println("Employee name : "+Employee_Name);
	
		System.out.println("Employee designation : "+Designation);
		
		System.out.println("Employee age : "+Age);
		
		System.out.println("Employee salary : "+Salary);
		
	}
}

class ClassObj3
{
	public static void main(String[] args) {
		
		System.out.print("Enter below details of employee.\n");

		Employee detail = new Employee();

		detail.GetEmployeeDetails();

		System.out.print("Employee details are shown below.\n");

		detail.DisplayEmployeeDetails();


	}
}