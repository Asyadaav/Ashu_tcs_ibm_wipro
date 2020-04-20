// example of perfect number 6 28 496
package test;
import java.util.*;
public class Perfect_number {
	/*
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int i;
		int sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			else
			{
			
			}
		}
		
		
		if(sum==n)
		{
			System.out.println("number is perfect");
		}
		else {
			System.out.println("number is not perfect");
		}
	}*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for check a perfect");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			else
			{
				
			}
			
		}
		
		//System.out.println(sum);
		
		if(num==sum)
		{
			System.out.println("given number is perfect number");
		}
		else
		{
			System.out.println("given number is not perfect number");
		}
	}

}
