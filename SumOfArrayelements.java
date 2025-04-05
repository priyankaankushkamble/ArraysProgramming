package ArraysProgram;
import java.util.*;
public class SumOfArrayelements 
{
	public static void main(String[] args)
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=xyz.nextInt();
	int a[]=new int[size];
	int sum=0;
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
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array element is:"+sum);

	}

}
