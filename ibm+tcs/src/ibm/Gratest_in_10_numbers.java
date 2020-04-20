package ibm;

import java.util.Scanner;

public class Gratest_in_10_numbers 
{
	 public static void main(String args[])
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter the size of array ");
		   int n=sc.nextInt();
		   int num[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
			    num[i]=sc.nextInt();
		   }
		   int gratest=0;
		   for(int i=0;i<n;i++)
		   {
			   if(num[i]>gratest)
			   {
				   gratest=num[i];
			   }
		   }
		 
		   System.out.println(+gratest);
	   }
}
