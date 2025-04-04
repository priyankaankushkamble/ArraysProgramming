package ArraysProgram;
import java.util.*;
public class MoveZeroArray
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
		System.out.println("\n Before move zero");
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		int left=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]>left)
			{
				int temp=a[i];
				a[i]=a[left];
				a[left]=temp;
				left++;
			}
		}
		System.out.println("\n After move zero");
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}	

}
