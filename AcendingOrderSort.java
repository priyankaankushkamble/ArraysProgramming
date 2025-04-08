package ArraysProgram;
import java.util.*;
public class AcendingOrderSort 
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
			System.out.println("Display array element");
			for(int i=0;i<size;i++)
			{
				System.out.printf("%d\t",a[i]);
			}
			System.out.println("\n");
			Arrays.sort(a);
			System.out.println("Arrays in acending order is:");
			for(int i=0;i<size;i++)
			{
				System.out.printf(a[i]+" ");
			}

	}

}
