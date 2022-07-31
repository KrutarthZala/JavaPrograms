import java.util.*;

class Member
{
    String Name,Address;
    byte age;
    long PhoneNo;
    float Salary;
    
    void printSalary()
    {
    	
    }
    
}

class Employee extends Member
{
	String Specialization;
	
	void getEmployeeDetails()
	{
		Scanner kz = new Scanner(System.in);
		
		System.out.println("Enter the name of employee : ");
		Name = kz.nextLine();
		System.out.println("Enter age of  employee : ");
		age = kz.nextByte();
		System.out.println("Enter phone number of  employee : ");
		PhoneNo = kz.nextLong();
		System.out.println("Enter address of  employee : ");
		Address = kz.nextLine();
		System.out.println("Enter salary of  employee : ");
		Salary = kz.nextFloat();
		System.out.println("Enter the specialization of employee : ");
		Specialization = kz.nextLine();
	}
}

class Manager extends Member
{
	String Department;
	
	void getManagerDetails()
	{
		Scanner kz = new Scanner(System.in);
		
		System.out.println("Enter the name of manager : ");
		Name = kz.nextLine();
		System.out.println("Enter age of manager : ");
		age = kz.nextByte();
		System.out.println("Enter phone number of  manager : ");
		PhoneNo = kz.nextLong();
		System.out.println("Enter address of  manager : ");
		Address = kz.nextLine();
		System.out.println("Enter salary of  manager : ");
		Salary = kz.nextFloat();
		System.out.println("Enter the department of employee : ");
		Department = kz.nextLine();
	}
}
public class Inheritance1 {
    public static void main(String[] args) {
    	
    }
}
