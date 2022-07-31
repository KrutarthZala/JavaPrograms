import java.util.*;

class ComplexAdd
{
	
	int real,img;

	ComplexAdd(int r,int i)
	{
		real = r;
		img = i;
	}

	ComplexAdd addition(ComplexAdd ca1 ,ComplexAdd ca2)
	{
		ComplexAdd sum = new ComplexAdd(0,0);

		sum.real = ca1.real + ca2.real;
		sum.img = ca1.img + ca2.img;

		return sum;
	}
}
class ComplexNumber
{
	public static void main(String[] args) {
		
		// ComplexAdd ca = new ComplexAdd();

		Scanner kz = new Scanner(System.in);

		System.out.print("Enter value of real part : ");
		int n1 = kz.nextInt();
		System.out.print("Enter value of imaginary part : ");
		int n2 = kz.nextInt();

		ComplexAdd ca1 = new ComplexAdd(n1,n2);

		System.out.print("Enter value of real part : ");
		int n3 = kz.nextInt();
		System.out.print("Enter value of imaginary part : ");
		int n4 = kz.nextInt();

		ComplexAdd ca2 = new ComplexAdd(n3,n4);
		
		ComplexAdd ca3 = new ComplexAdd(0,0);

		ca3 = ca3.addition(ca1,ca2);
		System.out.print(ca3.real+ ":" +ca3.img);
	}
		
}