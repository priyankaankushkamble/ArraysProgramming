package ArraysProgram;
import java.util.*;
public class MinimumArrayEle
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
			int min=a[0];
			for(int i=0;i<size;i++)
			{
				if(a[i]<min)
				{
					a[i]=min;
				}
			}
			System.out.println("Minimum array element is:"+min);

	}

}
