import java.util.*;

class Prog4
{
	public static void main(String[] args) {
		

		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the First Subject Mark: ");
		int m1 = kz.nextInt();

		System.out.print("Enter the Second Subject Mark: ");
		int m2 = kz.nextInt();

		System.out.print("Enter the Third Subject Mark: ");
		int m3 = kz.nextInt();

		System.out.print("Enter the Fourth Subject Mark: ");
		int m4 = kz.nextInt();

		System.out.print("Enter the Fifth Subject Mark: ");
		int m5 = kz.nextInt();

		double per = (m1+m2+m3+m4+m5) / 5;

		if ( per < 35 && per >= 0) 
		{
			System.out.print("You are Fail.");
		}
		else if (per >= 35 && per <= 45)
		{
			System.out.print("Pass Class.");
		}
		else if ( per >= 45 && per <= 60) 
		{
			System.out.print("Second Class.");
		}
		else if ( per >= 60 && per <= 70) 
		{
			System.out.print("first Class.");
		}
		else if ( per > 70 && per <= 100 ) 
		{
			System.out.print("Distinction.");
		}
		else
		{
			System.out.print("Enter Valid Marks.");
		}	
	}
}