//4,25
package test;
import java.util.*;

public class Perfect_square 
{
	/*
	public static void main(String args[])
	{
		System.out.println("enter a numbber");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int r=(int)Math.sqrt(num);
		int sqr=r*r;
		if(sqr==num)
		{
			System.out.println("given number is perfect square");
		}
		else
		{
			System.out.println("given number is not perfect square");
		}
	}
*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int r=(int)Math.sqrt(num);
		int sum=r*r;
		
		  if(sum==num)
		  {
			  System.out.println("the given number is example of perfect square");
		  }
		  else
		  {
			  System.out.println("given number is not example of perfect square");
		  }
		
	}
}
