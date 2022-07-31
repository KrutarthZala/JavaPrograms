import java.util.*;

class ArrayList2
{
    void enterNum()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner kz = new Scanner(System.in);
        int n1 = kz.nextInt();
        numbers.add(n1);
        int n2 = kz.nextInt();
        numbers.add(n2);
        int n3 = kz.nextInt();
        numbers.add(n3);
        int n4 = kz.nextInt();
        numbers.add(n4);
        int n5 = kz.nextInt();
        numbers.add(n5);
        //System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
class ArrList1
{
    public static void main(String args[])
    {
        System.out.println("Enter Five numbers : ");
        ArrayList2 a1 = new ArrayList2();
        a1.enterNum();

    }
}
