import java.util.*;

class MaxNumber
{
	static int maxnum(int a,int b)
	{
		if (a > b)
		{
			return a;	
		}
		else if (b > a) 
		{
			return b;	
		}
		else if ( a == b) 
		{
			return a;	
		}

		return 0;
	}
	public static void main(String[] args) {
		

		Scanner kz = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int n1 = kz.nextInt();

		System.out.print("Enter second number : ");
		int n2 = kz.nextInt();

		int max = maxnum( n1 ,n2);

		System.out.println("Maximum Number is "+max);
	}

}