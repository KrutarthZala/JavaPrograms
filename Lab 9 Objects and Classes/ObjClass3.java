
class Demo
{ 
	static  int count = 0;
	Demo()
	{
		count++;
	}

	public static void displayCounter()
	{
		System.out.println("Counter - "+ count);
	}
}
class ObjClass3
{
	public static void main(String[] args) {
		Demo d1= new Demo();
		Demo d2= new Demo();
		Demo d3= new Demo();
		Demo d4= new Demo();
		Demo d5= new Demo();
		Demo d6= new Demo();

		Demo.displayCounter();
	}
}