import java.util.*;

class Circle
{
	
	public  double area (float r)
	{
		return Math.PI * (double)r * (double)r;
	}
	
	public  double perimeter (float r)
	{
		return Math.PI * (double)r * 2;
	}
}

public class ClassObj1 {

	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);
		
		System.out.print("Enter radisus of a circle : ");
		float r = kz.nextFloat();
		
		Circle obj = new Circle();
		
		double ar = obj.area(r);
		
		System.out.print("Area of circle is "+ar);
		
		double pr = obj.perimeter(r);
		
		System.out.print("\nPerimeter of circle is "+pr);
	}

}
