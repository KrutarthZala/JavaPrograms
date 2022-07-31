import java.util.*;

class Prog2 
{
	public static void main(String[] args) {
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter the Letter: ");
		String n = kz.next();

		if (n.equals("a") || n.equals("e") || n.equals("i")|| n.equals("o") ||n.equals("u")) 
		{
			System.out.print("Character is vowel.");	
		}
		else
		{
			System.out.print("Character is consonant.");
		}
	}
}