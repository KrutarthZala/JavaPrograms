import java.util.*;

class ArLsStr
{
    void enterNum()
    {
        ArrayList<String> city = new ArrayList<String>();

        city.add("Delhi");
        city.add("Mumbai");
        city.add("Bangalore");
        city.add("Hyderabad");
        city.add("Ahmedabad");

        System.out.println("Before replacement : ");
        System.out.println(city);
        System.out.println("After replacement : ");
        city.set(4,"Surat");
        System.out.println(city);
    }
}
class ArrListStr
{
    public static void main(String args[])
    {
        ArLsStr a1 = new ArLsStr();
        a1.enterNum();
    }
}
