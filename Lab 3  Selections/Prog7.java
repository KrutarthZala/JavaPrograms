import java.util.*;

class Prog7 //Triangle Problems.
{
	public static void main(String[] args) {
		

		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the First Side: ");
		int s1 = kz.nextInt();

		System.out.print("Enter the Second Side: ");
		int s2 = kz.nextInt();

		System.out.print("Enter the Third Side: ");
		int s3 = kz.nextInt();

		if ( s1 == s2 && s2 == s3 && s1 == s3) 
		{
			System.out.println("Equilateral Triangle.");	
		}
		else if ( s1 == s2 || s2 == s3 || s1 == s3 ) 
		{
			System.out.println("Isosceles Triangle.");	
		}
		else if( s1*s1 == s2*s2 + s3*s3 || s2*s2 == s1*s1 + s3*s3 || s3*s3 == s2*s2 + s1*s1)
		{
			System.out.println("Right Angled Triangle.");	
		}
		else if( s1 != s2 && s2 != s3 && s1 != s3)
		{
			System.out.println("scalene Triangle.");	
		}
	}
}