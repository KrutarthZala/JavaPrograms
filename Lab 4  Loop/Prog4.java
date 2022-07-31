import java.util.*;

class Prog4 // Sum of series 
{
	public static void main ( String[] args)
	{

		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the term Number: ");
		int n = kz.nextInt();

		double sum = 0;

		for (double i=1 ; i <= n ; i++)
		{
			sum = sum + 1/i;
		} 

		System.out.print("Sum of given series is : "+sum);
	}
}