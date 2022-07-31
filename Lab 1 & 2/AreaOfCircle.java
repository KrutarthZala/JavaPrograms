import java.util.*;

class AreaOfCircle
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the Radius: ");
		int r = kz.nextInt();

		double pi = 3.14;

		double area = pi * r * r;

		System.out.print("Sum is :"+area);

	}
}