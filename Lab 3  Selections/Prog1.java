import java.util.*;

class Prog1 
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the Number: ");
		int n = kz.nextInt();

		if (n < 0) 
		{
			System.out.print("Number is Negative.");	
		}
		else
		{
			System.out.print("Number is Positive.");
		}
	}
}