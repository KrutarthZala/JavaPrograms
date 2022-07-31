import java.util.*;

class Prog8
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the Number of calls: ");
		int cl = kz.nextInt();

		double bill;

		if ( cl <= 100 && cl > 0) 
		{
			System.out.print("Your bill amount is 200 Rs.");
		}
		else if ( cl > 100 && cl <= 150)
		{
			bill = 200 + ( (cl - 100) * 0.60);
			System.out.print("Your bill amount is "+bill);
		}
		else if ( cl > 150 && cl <= 200)
		{
			bill = 200 + 50*0.6 + ( (cl - 150) * 0.50);
			System.out.print("Your bill amount is "+bill);
		}
		else if ( cl > 200)
		{
			bill = 200 + 50*0.6 + 50*0.4 + ( (cl - 200) * 0.40);
			System.out.print("Your bill amount is "+bill);
		}	
	}
}