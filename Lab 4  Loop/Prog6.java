import java.util.*;

class Prog6
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.println("Enter 0 when you want exit the program.");

		int sumo=0,sume=0;
		System.out.println("Enter the Numbers.");

		while(true)
		{
			int n = kz.nextInt();
			if (n==0) 
			{
				break;
			}
			if( n > 0 && n % 2 == 0)
			{
				sume = sume + n;
			}
			else if( n < 0 && n % 2 != 0)
			{
				sumo = sumo + n;
			}
		}

		System.out.println("Sum of all positive even numbers is "+sume);
		System.out.println("Sum of all negative odd numbers is "+sumo);

	}
}