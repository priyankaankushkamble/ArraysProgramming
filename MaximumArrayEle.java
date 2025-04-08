package ArraysProgram;
import java.util.*;
public class MaximumArrayEle
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
		int max=a[0];
		for(int i=0;i<size;i++)
		{
		if(a[i]>max)
		{
			max=a[i];
		}
		}
		System.out.println("Maximum number is:"+max);

	}

}
