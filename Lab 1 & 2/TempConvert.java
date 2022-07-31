import java.util.Scanner;
    
public class TempConvert{
     public static void main(String[] args) {

        double f,c;

        Scanner temp = new Scanner(System.in);

        System.out.println("Enter Temperature in Fahrenhit:");
        f = temp.nextDouble();

        c = ( f - 32) * 0.56;

        System.out.println("Temprature in celcius is :"+c);
        
    }
}