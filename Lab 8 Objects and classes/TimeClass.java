import java.util.*;

class Time
{
	int hour,minute;

	void getTimeDetails()
	{
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter value of hour : ");
		hour = kz.nextInt();
		System.out.print("Enter value of minute : ");
		minute = kz.nextInt();
	}

	Time addition(Time sum)
	{
		sum.hour += hour;
		sum.minute += minute;
		
		while(sum.minute >= 60)
		{
			sum.hour++;
			sum.minute -= 60;
		} 
		return sum;
	}
}

class TimeClass
{

	public static void main(String[] args) {
		
		Time obj = new Time();
		Time obj1 = new Time();
		Time obj2;
		
		obj.getTimeDetails();
		obj1.getTimeDetails();

		obj2 = obj1.addition(obj);

		System.out.print("Hours : " +obj2.hour);
		System.out.print("\nMinutes : "+obj2.minute+"\n");
	}
}