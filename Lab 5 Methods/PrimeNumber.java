import java.util.*;

class PrimeNumber
{
	static int check(int n)
	{
		int k = 0;
		if ( n == 0 || n == 1) 
		{
			System.out.print("Number is not Prime or composite.");	
		}

		for (int i = 1; i <= n ;i++ ) 
		{
			if ( n % i == 0) 
			{
				k++;	
			}
		}

		if ( k == 2) 
		{
			return 1;	
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int a = kz.nextInt();

		int p = check(a);

		System.out.print(p);
	}
}