package test;
import java.util.*;
public class Star_pattern1
{
 public static void main(String args[])
 {
	/* for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=5;j++)
		 {
			 if(i>=j)
			 {
				System.out.print("*"); 
			 }
			 else
			 {
				 System.out.print(" ");
			 }
			 
		 }
		 System.out.println();
	 }
	 */
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of row");
	int row=sc.nextInt();
	int col=row;
	 for(int i=1;i<=row;i++)
	 {
		 for(int j=1;j<=col;j++)
		 {
			 if(j>=(row+1)-i)
			 {
				 System.out.print("*");
			 }
			 else
				 System.out.print(" ");
			
		 }
		 System.out.println();
	 }
 }
}
