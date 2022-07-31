import java.util.*;

class FibonacciSeries
{
	static void fibonacciseries(int a)
	{
		int p=0,q=1,r;

		System.out.printf("%d %d ",p,q);

		for (int i=3;i <= a ;i++ ) 
		{
			r = p + q;
			System.out.printf("%d ",r);
			p = q;
			q = r;	
		}
	}
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the term number of fibonacci sreries : ");
		int n = kz.nextInt();

		fibonacciseries(n);

	}
}