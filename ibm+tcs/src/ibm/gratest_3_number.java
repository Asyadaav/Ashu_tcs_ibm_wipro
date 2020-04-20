package ibm;

import java.util.Scanner;

public class gratest_3_number
{
	 public static void main(String args[])
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter three number for find out gratest ");
		   int num1=sc.nextInt();
		   int num2=sc.nextInt();
		   int num3=sc.nextInt();
		   System.out.println("the gratest number is");
		   if(num1>num2 && num1>num3)
		   {
			   System.out.println(+num1);
		   }
		   else if(num2>num1 && num2>num3)
		   {
			   System.out.println(+num2);
		   }
		   else
		   {
			   System.out.println(+num3);
		   }
		  
		   
	   }
}
