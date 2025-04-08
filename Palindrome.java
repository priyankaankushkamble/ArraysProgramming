package ArraysProgram;
import java.util.Scanner;
public class Palindrome 
{
        public static void main(String[] args) 
        {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter a number to check for palindrome:");
        int no = xyz.nextInt();
        int temp = no;
        int reverse = 0;
        
   
        while (no > 0)
        {
            int digit = no % 10;  
            reverse = reverse * 10 + digit; 
            no /= 10;
        }
        if (reverse == temp)
        {
            System.out.println("Palindrome");
        }
        else 
        {
            System.out.println("Not a palindrome");
        }
        
      
    }
}

