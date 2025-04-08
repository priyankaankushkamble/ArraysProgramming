package ArraysProgram;
import java.util.*;
public class CommonElementArray
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);	
		System.out.println("Enter the array size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter the first array element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter the second array element");
		for(int i=0;i<size;i++)
		{
			b[i]=xyz.nextInt();
		}
		        // Using HashSet for efficient lookup
		        Set<Integer> set1 = new HashSet<>();
		        Set<Integer> common = new HashSet<>();

		        // Add elements of arr1 to set1
		        for (int num:a[i]) 
		        {
		            set1.add(num);
		        }

		        // Check for common elements in arr2
		        for (int num:b[i]) 
		        {
		            if (set1.contains(num))
		            {
		                common.add(num);
		            }
		        }

		        // Print the common elements
		        System.out.println("Common Elements: " + common);
		 }

}
