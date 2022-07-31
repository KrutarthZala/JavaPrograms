import java.util.*;

class AdditionNum
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the First Number: ");
		int n1 = kz.nextInt();

		System.out.print("Enter the Second Number: ");
		int n2 = kz.nextInt();

		int sum = n1 + n2;

		System.out.print("Sum is :"+sum);

	}
}