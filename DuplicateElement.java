package ArraysProgram;
import java.util.*;
public class DuplicateElement 
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size");
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
			System.out.println("");
			int duplicateset=a[0];
			int uniqueset=a[0];
			for(int i=0;i<size;i++)
			{
				duplicateset=uniqueset;
				uniqueset=a[i];
			}
			if(a[i]>=duplicateset)
					{
					System.out.printf("No duplicate element");
					}
			else (duplicateset>uniqueset&&uniqueset!=duplicateset)
			{
				
				System.out.println("Duplicate numberis:"+duplicateset);
			}
			
			
	}
	

}
