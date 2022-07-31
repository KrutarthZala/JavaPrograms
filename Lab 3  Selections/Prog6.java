import java.util.*;

class Prog6 //Simple Calculator.
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Exit.\n");
		System.out.print("Enter your choise : ");

		int ch = kz.nextInt();

		int n1,n2;

		System.out.print("Enter the First Number: ");
		n1 = kz.nextInt();

		System.out.print("Enter the Second Number: ");
		n2 = kz.nextInt();

		switch (ch)
		{
			case 1:

				int sum = n1 + n2;
				System.out.println("Addtion of given two numbers is "+sum);
				break;

			case 2:
				System.out.print("Enter the First Number: ");
				 n1 = kz.nextInt();

				System.out.print("Enter the Second Number: ");
				 n2 = kz.nextInt();

				int minus = n1 - n2;
				System.out.println("Subtraction of given two numbers is "+minus);
				break;

			case 3:

				int mux = n1 * n2;
				System.out.println("Multiplication of given two numbers is "+mux);
				break;

			case 4:

				double div = n1 / n2;
				System.out.println("Division of given two numbers is "+div);
				break;

			case 5:
				System.exit(0);
				break;	

			default:
				System.out.println("Enter Valid Choise.");				
		}
	}
}