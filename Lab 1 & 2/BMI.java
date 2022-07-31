import java.util.*;

class BMI
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the weight in pounds: ");
		int pd = kz.nextInt();

		System.out.print("Enter the height in inches: ");
		int in = kz.nextInt();

		double kg = pd * 0.45359237;

		double meter = in * 0.254;

		double bmi = kg / ( meter * meter);

		System.out.print("Your BMI is :"+bmi);

	}
}