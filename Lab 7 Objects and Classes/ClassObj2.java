import java.util.*;

class Bank_Account
{
	long Account_No;
	String User_Name,Email,Account_Type;
	float Account_Balance;

	public void GetAccountDetails()
	{
		Scanner kz = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		
		System.out.print("Enter user account no : ");
		Account_No = kz.nextLong();
		System.out.print("Enter user name : ");
		User_Name = str.nextLine();
		System.out.print("Enter user email : ");
		Email = kz.next();
		System.out.print("Enter user account type : ");
		Account_Type = kz.next();
		System.out.print("Enter user account balance : ");
		Account_Balance = kz.nextFloat();
	}

	public void DisplayAccountDetails()
	{
		System.out.println("User account no : "+Account_No);
		
		System.out.println("User name : "+User_Name);
	
		System.out.println("User email : "+Email);
		
		System.out.println("User account type : "+Account_Type);
		
		System.out.println("User account balance : "+Account_Balance);
		
	}
}

class ClassObj2
{
	public static void main(String[] args) {
		
		System.out.print("Enter below details of user.\n");

		Bank_Account detail = new Bank_Account();

		detail.GetAccountDetails();

		System.out.print("User details are shown below.\n");

		detail.DisplayAccountDetails();


	}
}