package demo;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		
		Loan l = new Loan();
		Circle c = new Circle();
		Date d = new Date();
		string s = new string();
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add(l);
		al.add(c);
		al.add(d);
		al.add(s);
		
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i).toString());
		}
		
	}

}

class Loan
{
	String s1 = "This ia a Loan Object";
    public String toString()
	{
		return s1;
	}
}

class Circle
{
	String s2 = "This ia a Circle Object";
    public String toString()
	{
		return s2;
	}
}

class Date
{
	String s3 = "This ia a Date Object";
    public String toString()
	{
		return s3;
	}
}

class string
{
	String s4 = "This ia a string Object";
    public String toString()
	{
		return s4;
	}
}






