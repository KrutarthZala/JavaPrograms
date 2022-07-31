import java.util.*;

class ArLsStr
{
    void enterNum()
    {
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> subname = new ArrayList<String>();

        name.add("Aarav");
        name.add("Kabir");
        name.add("Vivaan");
        name.add("Ayaan");
        name.add("Aditya");

        for ( int i = 0 ; i < name.size() ; i++)
        {
            if( name.get(i).charAt(0) == 'A')
            {
                subname.add(name.get(i));
            }
        }

        System.out.println("Main ArrayList : ");
        System.out.println(name);
        System.out.println("Sub ArrayList : ");
        System.out.println(subname);

        
    }
}
class ArrListstr2
{
    public static void main(String args[])
    {
        ArLsStr a1 = new ArLsStr();
        a1.enterNum();
    }
}
