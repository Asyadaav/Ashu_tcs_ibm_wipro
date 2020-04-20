package ibm;
import java.util.*;
public class Swapping_bitwise 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter two number for swapping ");
	   int num1=sc.nextInt();
	   int num2=sc.nextInt();
	   int k;
	   num1=num1^num2;
	   num2=num1^num2;
	   num1=num1^num2;
	   System.out.println("the swappped vakue of num1 "+num1 +" and num2 is"+num2);
	   
   }
}
