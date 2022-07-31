import java.util.*;

class Prog1
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the First Number: ");
		int n1 = kz.nextInt();

		System.out.print("Enter the Second Number: ");
		int n2 = kz.nextInt();

		System.out.print("Numbers are : ");

		if ( n1 < n2) 
		{
			for (int i = n1; i <= n2 ; i++ ) 
			{
				if ( i % 2 == 0 && i % 3 != 0) 
				{
					System.out.println(+i);
				}
			}
		}
		else if ( n2 < n1 )
		{
			for (int i = n2; i <= n1 ; i++ ) 
			{
				if ( i % 2 == 0 && i % 3 != 0) 
				{
					System.out.println(+i);
				}
			}
		}
	}

}