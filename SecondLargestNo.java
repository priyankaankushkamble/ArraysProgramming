package ArraysProgram;
import java.util.*;
public class SecondLargestNo 
{
	  public static void main(String x[])
	  {
	     Scanner xyz=new Scanner(System.in);
	     System.out.println("Enter the array size");
	     int size=xyz.nextInt();
	     int a[]=new int[size];
	     int i;
	     System.out.println("Enter the array element");
	     for(i=0;i<size;i++)
	        {
	          a[i]=xyz.nextInt();
		}
	       int largest=Integer.MIN_VALUE;
	       int secondLargest =Integer.MIN_VALUE;

	        for(i=0;i<a.length;i++) 
	        {
	            if (a[i]>largest) 
	            {
	                secondLargest = largest;
	                largest = a[i];
	            } 
	            else if (a[i]>secondLargest&&a[i]!=largest) 
	            {
	                secondLargest = a[i];
	            }
	        }

	        if (secondLargest ==Integer.MIN_VALUE) 
	        {
	            System.out.println("There is no second largest element.");
	        } 
	        else 
	        {
	            System.out.println("Second largest number is: " + secondLargest);
	        }
	    }
}