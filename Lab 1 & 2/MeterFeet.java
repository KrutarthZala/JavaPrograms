import java.util.*;

class MeterFeet
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the number in Meter: ");
		int nm = kz.nextInt();

		double mf = 3.28084;

		double nf = mf * nm;

		System.out.print("Feet is :"+nf);

	}
}