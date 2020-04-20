package test;
import java.util.*;
public class Matrix_multiplication {
	/*
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3] ;
		System.out.println("enter a value for first matrix");
		                    for(int i=0;i<3;i++)
		                     {
			                for(int j=0;j<3;j++)
			                {
				             a[i][j]=sc.nextInt();
			                 }
		                     }
			System.out.println("enter a value for second ,matrix");                
			                for(int i=0;i<3;i++)
		                     {
			                for(int j=0;j<3;j++)
			                {
				             b[i][j]=sc.nextInt();
			                 }
		                     }
		System.out.println("the matrix multiplication is");
		  for(int i=0;i<3;i++)
          {
         for(int j=0;j<3;j++)
         {
        	 
          c[i][j]=0;
          for(int k=0;k<3;k++)
          {
        	  c[i][j]=c[i][j]+a[i][k]*b[k][j];
          }
         }
          }
         for(int i=0;i<3;i++)
         {
        for(int j=0;j<3;j++)
        {
        System.out.println(+c[i][j]);
         }
		
		}
	}
*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the value into the first matrix");
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("value of first matrix is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
		}
		
		
		System.out.println("enter the value into the second matrix");
		int b[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("value of second matrix is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+b[i][j]);
				
			}
			System.out.println();
		}
		
		//System.out.println();
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				 c[i][j]=0;
				for(int k=0;k<3;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}	
			}
		}
		System.out.println(" matrix multiplication is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+c[i][j]);
				
			}
			System.out.println();
		}
		
	}
		}