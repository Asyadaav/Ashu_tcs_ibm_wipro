package test;
import java.util.*;
public class Addition_of_matrix
{
	/* public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value for Matrix A");
int a[][]=new int[3][3];
                    for(int i=0;i<3;i++)
                    {
                    	for(int j=0;j<3;j++)
                    	{
                    		a[i][j]=sc.nextInt();
                    	}
                    }
  System.out.println("enter a matrix B");                  
                    int b[][]=new int[3][3];
                    for(int i=0;i<3;i++)
                    {
                    	for(int j=0;j<3;j++)
                    	{
                    		b[i][j]=sc.nextInt();
                    	}
                    }
      System.out.println("Sum of the given matrix is");
      int c[][]=new int[3][3];
      for(int i=0;i<3;i++)
      {
      	for(int j=0;j<3;j++)
      	{
      		c[i][j]=a[i][j]+b[i][j];
      		System.out.print(c[i][j]);
      	}
      	System.out.println();
      }
	}
	*/
	public static void main(String args[])
	{
	      Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n =sc.nextInt();
		
		
      System.out.println("enter the value of of matrix!");
      int a[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
            	
            	for(int j=0;j<n;j++)
            	{
            		a[i][j]=sc.nextInt();
            	}
            }
            
            
            System.out.println("enter the value of of matrix2");
            int b[][]=new int[n][n];
                  for(int i=0;i<n;i++)
                  {
                  	for(int j=0;j<n;j++)
                  	{
                  		b[i][j]=sc.nextInt();
                  	}
                  }
                  
                  
                  System.out.println("the addition of given matrix is!");
                  int c[][]=new int[n][n];
                        for(int i=0;i<n;i++)
                        {
                        	for(int j=0;j<n;j++)
                        	{
                        		c[i][j]=a[i][j]+b[i][j];
                        		System.out.print(c[i][j]+" ");
                        	}
                        	System.out.println();
                        }
	}
}
