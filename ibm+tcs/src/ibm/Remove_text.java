package ibm;

import java.util.Scanner;

public class Remove_text {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a String ");
	String str2=sc.nextLine();
	String str[]=str2.split(" ");
	//String str[]= {"Ashutosh","Amish","Surbhi","Suprita","Anju"};
	System.out.println("enter a text for replace");
	String str1=sc.nextLine();
	String ashu="";
	
	for(int i=0;i<str.length;i++)
	{
		if((str[i]).equals(str1))
		{
			
		}
		else
		{
			ashu=ashu+" "+str[i];
			System.out.print(" "+str[i]);
		}
	}
	System.out.println();
	System.out.println(ashu);
	
	}
}
	
