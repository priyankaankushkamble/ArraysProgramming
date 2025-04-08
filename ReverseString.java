package ArraysProgram;
import java.util.*;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		String s=new String("Hello");
		System.out.println(s);
		
		String reverse=new StringBuilder(s).reverse().toString();
		System.out.println("Reverse is:"+reverse);
	}
	

}
