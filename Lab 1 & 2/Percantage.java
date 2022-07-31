import java.util.Scanner;


public class Percantage {

    public static void main(String[] arg)
    {

        Scanner mark = new Scanner(System.in);

        System.out.println("Enter 1st student mark:");
        int m1 = mark.nextInt();
        System.out.println("Enter 2nd student mark:");
        int m2 = mark.nextInt();
        System.out.println("Enter 3rd student mark:");
        int m3 = mark.nextInt();
        System.out.println("Enter 4th student mark:");
        int m4 = mark.nextInt();
        System.out.println("Enter 5th student mark:");
        int m5 = mark.nextInt();

        double per = ( m1 + m2 +m3 +m4 +m5) / 5;

        System.out.println("Percentage is:"+per);

    }
    
}
