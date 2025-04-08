package ArraysProgram;
import java.util.*;
public class MissingElement 
{
		public static void main(String x[])
		{
		Scanner xyz=new Scanner(System.in);
			int a[]=new int[5];
			int temp,i,j;
		System.out.println("Enter five element in array");
		for(i=0;i<5;i++)
		a[i]=xyz.nextInt();
		for(i=0;i<a.length;i++)
			{
			for(j=i+1;j<5;j++)
			{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
		}
		System.out.printf("\n Sorted Array\n");
		for(i=0;i<5;i++)
		System.out.print(" "+a[i]);
		System.out.printf("\n Missing Element are\n");
		for(i=0;i<a.length-1;i++)
		{
		for(j=a[i]+1;j<a[i+1];j++)
		{
		System.out.printf("\t %d",j);	
		}
		}
		}

}
