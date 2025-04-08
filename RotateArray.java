package ArraysProgram;
import java.util.*;
public class RotateArray 
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the array size");
	int size=xyz.nextInt();
	int a[]=new int[size];
	int i,n;
	n=xyz.nextInt();
	System.out.println("Enter the array element");
	for(i=0;i<a.length;i++)
	  {
		a[i]=xyz.nextInt();
	  }
	        System.out.println("From "+n+"th position values of the array:");
                for(i=n;i<size;i++) 
	           {
                 System.out.print(a[i] + " ");
               }
                        System.out.println();
	                {
	                System.out.println("Before "+n+"th position array is:");
	                for(i=0;i<a.length;i++)
	                System.out.println(a[i]+" ");
	                }
	                System.out.println();
	        {
		       System.out.println("After "+n+"th position  array is:");
		       for(i=0;i<a.length;i++)
		       System.out.println(a[i]+" ");
	        }
		System.out.println("");
		{
	 	       System.out.println("Enter the position to rotate from:");
		       rotateArray(a,n);
		       
		       System.out.println("\n Array after rotation");
		       for(int i=0;i<size;i++)
		       {
		    	   System.out.printf("%d\t",a[i]);
		       }
	 	       
		}
	}
		
	
}
		
	
