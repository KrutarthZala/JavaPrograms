import java.util.*;

class Array6
{
	public static void main(String[] args) {
			
			Scanner kz = new Scanner(System.in);

			System.out.print("Enter the size of matrix : ");
			int n = kz.nextInt();

			int [][] m1 = new int[n][n];
			int [][] m2 = new int[n][n];
			int [][] ans = new int[n][n];

			System.out.print("MATRIX --> 1 \nEnter the elements.\n");

			for (int i = 0 ; i < n ; i++ ) 
			{
				for (int j = 0; j < n ; j++ ) 
				{
					System.out.printf("Element %d %d : ",i,j);
					m1 [i][j]  = kz.nextInt();			
				}	
			}

			for (int i = 0 ; i < n ; i++ ) 
			{
				for (int j = 0; j < n ; j++ ) 
				{
					System.out.print(m1 [i][j] +" ");			
				}	
				System.out.println();
			}


			System.out.print("MATRIX --> 2 \nEnter the elements.\n");

			for (int i = 0 ; i < n ; i++ ) 
			{
				for (int j = 0; j < n ; j++ ) 
				{
					System.out.printf("Element %d %d : ",i,j);
					m2 [i][j]  = kz.nextInt();			
				}	
			}

			for (int i = 0 ; i < n ; i++ ) 
			{
				for (int j = 0; j < n ; j++ ) 
				{
					System.out.print(m2 [i][j] +" ");			
				}	
				System.out.println();
			}

			System.out.print("Multiplication of above two matrix is given below.\n");

			for (int i = 0 ; i < n ; i++ ) 
			{
				for (int j = 0; j < n ; j++ ) 
				{
					ans[i][j] = 0;
					for (int k = 0 ; k < n ; k++ ) 
					{
						ans[i][j] += m1[i][k] * m2[k][j];						
					}
					System.out.print(ans [i][j]+" ");			
				}	
				System.out.println();
			}


		}	
}