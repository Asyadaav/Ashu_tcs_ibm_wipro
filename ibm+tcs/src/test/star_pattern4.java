package test;

import java.util.Scanner;

public class star_pattern4 
{

	public static void main(String args[])
	 {
		
		/*int m=1;
		boolean k=true;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j<=4+i && j>=6-i && k)
				{
					
					System.out.print(m);
					m=1-m;
					k=false;
				}
				else
				{
					System.out.print(" ");
					k=true;
				}
			}
			System.out.println();
		}
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row");
		int row=sc.nextInt();
		int col=(row*2)-1;
		int m=1;
		boolean k=true;
		for(int i=1;i<=(row);i++)
		{
			for(int j=0;j<=col;j++)
			{
				if(j>=(row+1)-i && j<=(row-1)+i && k)
				{
					System.out.print(m);
					m=1-m;
					k=false;
				}
				else
				{
					System.out.print(" ");
					k=true;
				}
			}
			System.out.println();
		}
		//System.out.println();
	 }
}
