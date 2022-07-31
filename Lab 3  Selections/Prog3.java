import java.util.*;

class Prog3 //Largest Number from three Numbers using Logical Operators.
{
	public static void main(String[] args) {
		

		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the First Number: ");
		int n1 = kz.nextInt();

		System.out.print("Enter the Second Number: ");
		int n2 = kz.nextInt();

		System.out.print("Enter the Third Number: ");
		int n3 = kz.nextInt();

		if ( n1 > n2 && n1 > n3) 
		{
			System.out.println("Largest Number is "+n1);	
		}
		else if ( n2 > n3 && n2 > n1) 
		{
			System.out.println("Largest Number is "+n2);	
		}
		else if( n3 > n1 && n3 > n2)
		{
			System.out.println("Largest Number is "+n3);	
		}
	}
}