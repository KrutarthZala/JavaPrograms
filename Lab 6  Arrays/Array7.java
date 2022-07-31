import java.util.*;

class Array7
{
	static void selection_sort(int m[])
	{
		for (int i = 0; i < m.length - 1; i++)  
        {    
        	int index = i;
            for (int j = i + 1; j < m.length; j++)
            {  
                if (m[j] < m[index])
                {  
                    index = j;
                }  
            }  
            int snum = m[index];   
            m[index] = m[i];  
            m[i] = snum;  
        }  
    } 
	public static void main(String[] args) 
	{
		
		Scanner kz = new Scanner(System.in);

		System.out.print("Enter size of an array : ");
		int n = kz.nextInt();

		int arr [] = new int[n];

		System.out.print("Enter elements in array.\n");

		for (int i = 0 ; i < n ; i++ ) 
		{
			arr[i] = kz.nextInt();
		}

		System.out.print("Array before selection sort.\n");

		for (int i = 0 ; i < n ; i++ ) 
		{
			System.out.print(arr[i]+" ");
		}

		selection_sort(arr);

		System.out.print("\nArray after selection sort.\n");

		for(int i:arr)
		{  
            System.out.print(i+" ");  
		}
	}
}