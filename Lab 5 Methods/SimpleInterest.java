import java.util.*;

class SimpleInterest
{
	static double sinterest(double x,double y, double z)
	{
		double si = x + x*y*z;
		return si;

	}
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the Price Amount : ");
		double p = kz.nextDouble();

		System.out.print("Enter the Rate value : ");
		double r = kz.nextDouble();

		System.out.print("Enter the time period in years : ");
		double t = kz.nextDouble();

		double amount = sinterest(p, r, t);

		System.out.println("Your Simple Interest amount is "+amount);



	}
}