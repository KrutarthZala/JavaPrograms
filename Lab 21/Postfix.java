import java.util.Stack;

public class Postfix {
	public static void main(String[] args) {
		
		//String p = args[0];
		
		Stack<Integer> ps = new Stack<Integer>();
		int n1,n2,next;
		char op;
		for (int i = 0; i < args.length; i++) 
		{
			if(isChar(args[i])){
			if (Integer.parseInt(args[i])<= 9 && Integer.parseInt(args[i])>=0 ) 
			{
				ps.push(Integer.parseInt(args[i]));
			}
			}
			else if ( args[i].charAt(0) == '+' ||  args[i].charAt(0) == '-' || args[i].charAt(0) == '*' || args[i].charAt(0) == '/' )
			{
				
				n1 = ps.pop();
				n2 = ps.pop();
				op = args[i].charAt(0);
				next = evaluatePostfix(n1 , n2, op);
				ps.push(next);
				
			}
		
		}
		System.out.println("Answer is "+ps.peek());
		
	}
	static int evaluatePostfix(int n1 ,int n2 ,char op)
	{
		int ans = 0;
		switch (op) 
		{
			case '+':
				ans = n1 + n2;
				break;
			case '-':
				ans = n1 - n2;
				break;
			case '*':
				ans = n1 * n2;
				break;
			case '/':
				ans = n1 / n2;
				break;	
			default:
				System.out.println("Enter valid choice!");
				break;
		}
		
		return ans;
		
	}
	static boolean isChar(String str) {
		try {
			int a=Integer.parseInt(str);
			return true;
		}catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}
}
