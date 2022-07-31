import java.util.*;

class Prog3 // Prime Number.
{

	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the Number: ");
		int n = kz.nextInt();

		int k=0;

		if ( n==0 || n==1) 
		{
			System.out.print("Number is not Prime.");
		}
		else
		{
			for ( int i = 1; i <= n ; i++ ) 
			{
				if ( n%i == 0 ) 
				{
					k++;
				}
			}
		}

		if ( k == 2) 
		{
			System.out.print("Given number is Prime number.");
		}
		else
		{
			System.out.print("Given number is not Prime.");
		}
	}
}