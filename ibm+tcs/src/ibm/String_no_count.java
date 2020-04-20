package ibm;
import java.sql.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class String_no_count 
{
  // Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
   Scanner sc=new Scanner(System.in);
	System.out.println("enter a String ");
	String str2=sc.nextLine();
	String str[]=str2.split(" ");
	
	
	String ashu="";
  
	
	
	for(int i=0;i<str.length;i++)
	{
		str=str2.split(" ");
		int n=0;
		for( int j=0;j<str.length;j++)
		{
			if(str[i].equals(str[j]))
			{
				n++;
				//str2.replaceAll("ashu", "");
			}
			else
			{
				
			}
			
		}
		System.out.println(" "+str[i]+" "+n);
		//str2=str2.deletecharAt(i);
		
		if((str[i]).equals(str))
		{
			
		}
		
		 //str=ashu;
	}
	System.out.println(str2);
	}
}
