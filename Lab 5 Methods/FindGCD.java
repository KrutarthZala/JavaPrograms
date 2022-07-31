import java.util.*;

class FindGCD
{
	public static int gcd(int num1,int num2)
	{
		/* First method
		int k = 0;
		for (int i = 1; i<=num1 ; i++ ) 
		{
			if (num1%i == 0 && num2%i == 0) 
			{
				g=i;
			}
		}
		return g;
		*/
		//Second method
		while( num1 % num2 != 0)
		{
			int r = num1 % num2;
			num1 = num2;
			num2 = r;
		}

		return num2;	
	}
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int n1 = kz.nextInt();

		System.out.print("Enter second number : ");
		int n2 = kz.nextInt();

		int s = gcd(n1,n2);

		System.out.print("GCD of given two numbers is "+s);
	}
}