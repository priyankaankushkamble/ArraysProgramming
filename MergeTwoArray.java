package ArraysProgram;
import java.util.*;
public class MergeTwoArray 
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		System.out.println("Enter the first array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
			System.out.println("Enter the second array element");
			for(int i=0;i<b.length;i++)
			{
				b[i]=xyz.nextInt();
			}
			int result[]=getMergeArray(a,b);
			System.out.println("Display array after merging");
			for(int i=0;i<result.length;i++)
			{
				System.out.printf("%d\t",result[i]);
			}
		}

public static int[]getMergeArray(int m[],int n[])
	{
	int t=0;
	int k[]=new int[m.length+n.length];
	for(int i=0;i<m.length;i++,t++)
	{
	k[i]=m[i];
	}
	for(int j=0;j<n.length;j++,t++)
	{
	  k[t]=n[j];	
	}
		return k;
	}
	
}
