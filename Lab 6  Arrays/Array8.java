import java.util.*;

class Array8
{
	public static void main(String[] args) 
	{
		Scanner kz = new Scanner(System.in);

		int matrix [][] = new int[4][4];

			for (int i = 0 ; i < 4 ; i++ ) 
			{
				for (int j = 0; j < 4 ; j++ ) 
				{
					System.out.printf("Element %d %d : ",i,j);
					matrix [i][j]  = kz.nextInt();			
				}	
			}

			for (int i = 0 ; i < 4 ; i++ ) 
			{
				for (int j = 0; j < 4 ; j++ ) 
				{
					System.out.print(matrix [i][j] +" ");			
				}	
				System.out.println();
			}

			System.out.print("Sum of numbers of each row is given below.\n");

			for (int i = 0 ; i < 4 ; i++ ) 
			{
				int sumrow = 0;
				for (int j = 0; j < 4 ; j++ ) 
				{
					sumrow += matrix[i][j];			
				}
				System.out.printf("Sum of numbers of row %d is %d.\n",i+1,sumrow);	
			}

			System.out.print("Sum of numbers of each column is given below.\n");

			for (int j = 0 ; j < 4 ; j++ ) 
			{
				int sumcolumn = 0;
				for (int i = 0; i < 4 ; i++ ) 
				{
					sumcolumn += matrix[i][j];			
				}
				System.out.printf("Sum of numbers of column %d is %d.\n",j+1,sumcolumn);	
			}
	}
}