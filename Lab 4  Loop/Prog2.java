import java.util.*;

class Prog2 // Factorial of given Number.
{

	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the Number: ");
		int n = kz.nextInt();

		int fact = 1;

		for (int i = 1 ;i <= n  ; i++ ) 
		{
			fact = fact * i;	
		}

		System.out.print("Factorial of given number is : "+fact);
	}
}