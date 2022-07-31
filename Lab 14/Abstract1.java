
abstract class Vegetable
{
	String color;

	Vegetable(String c)
	{
		color = c;
	}

	// void printColor()
	// {
	// 	System.out.print("Color is "+color);
	// }
}

class Potato extends Vegetable
{
	Potato()
	{
		super("light brown");
	}
	public String toString()
	{
		// System.out.print("Name : Potato");
		// System.out.print("Color : "+color);
		return "Potato "+color;
	}
}

class Brinjal extends Vegetable
{
	Brinjal()
	{
		super("Purple");
	}
	public String toString()
	{
		// System.out.print("Name : Brinjal");
		// System.out.print("Color : "+color);
		return "Brinjal "+color;
	}

}

class Tomato extends Vegetable
{
	Tomato()
	{
		super("Red");
	}
	public String toString()
	{
		// System.out.print("Name : Tomato");
		// System.out.print("Color : "+color);
		return "Tomato "+color;
	}
}


class Abstract1
{
	public static void main(String[] args) {
		Potato p = new Potato();
		System.out.println(p);
		Brinjal b = new Brinjal();
		System.out.println(b);
		Tomato t = new Tomato();
		System.out.println(t);
	}
}