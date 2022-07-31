import java.util.*;

class Prog5 // Reverse number
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the Number: ");
		int rnum = 0;

		for (int n = kz.nextInt(); n > 0 ; n = n / 10) 
		{
			int rem = n % 10;
			rnum = rnum * 10 + rem;
			
		}
 
		System.out.print("Reverse Number is : "+rnum);
	}
}