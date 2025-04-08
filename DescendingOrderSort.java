package ArraysProgram;
import java.util.*;
public class DescendingOrderSort
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
			System.out.println("Display the array element");
			for(int i=0;i<size;i++)
			{
				System.out.printf("%d\t",a[i]);
			}
			System.out.println("\n");
			Arrays.sort(a);
			System.out.println("Array in decsending order is:");
			for(int i=size-1;i>=0;i--)
			{
				System.out.println(" "+a[i]);
			}
		

	}

}
