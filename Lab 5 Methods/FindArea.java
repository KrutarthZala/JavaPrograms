import java.util.*;

class FindArea
{
	static double area(float radius)
	{
		return Math.PI * radius * radius;
	}

	static float area(float len,float wid)
	{
		return len * wid;
	}

	static double area(float s1,float s2,float s3)
	{
		float S = (s1+s2+s3) / 2;
		float k = S * (S - s1) * (S - s2) * (S - s3);
		return Math.sqrt(k);
	}

	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		// Area of circle
		System.out.print("Enter Radius of Circle : ");
		float r = kz.nextFloat();

		double a1 = area(r);
		System.out.println("Area of circle is "+a1);

		// Area of Square is not possible in this overloading. 
		// Because it conflicts with area of circle.
		// So, I write area of rectangle.

		System.out.print("Enter length of Rectangle : ");
		float l = kz.nextFloat();

		System.out.print("Enter width of Rectangle : ");
		float w = kz.nextFloat();

		float a2 = area(l,w);
		System.out.println("Area of rectangle is "+a2);

		//Area of triangle.
		System.out.print("Enter first side of triangle : ");
		float s1 = kz.nextFloat();

		System.out.print("Enter second side of triangle : ");
		float s2 = kz.nextFloat();

		System.out.print("Enter third side of triangle : ");
		float s3 = kz.nextFloat();

		double a3 = area(s1,s2,s3);
		System.out.print("Area of triangle is "+a3);
	}
}