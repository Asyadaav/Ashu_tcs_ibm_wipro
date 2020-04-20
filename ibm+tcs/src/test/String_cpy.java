package test;
import java.util.*;
public class String_cpy 
{
	public static void main(String args[])
	{
	/*{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str;
		str=sc.nextLine();
		String str1;
		str1="";
		//str1=str.cop
		for(int i=0;i<str.length();i++)
		{
			str1=str1+str.charAt(i);
		}
			
		System.out.println("string copy using without function   "+str1);
		
		String str2;
		str2=str.toString();
		System.out.println("String copy using function     "+str2);
		*/
	
	
	    System.out.println("enter a string");
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String str1="";
	        
	        for(int i=0;i<str.length();i++)
	        {
	        	str1=str1+str.charAt(i);
	        }
	    System.out.println(str1);
	    String str2;
	   str2=str.toString();
	    System.out.println(str2);
	    
	}

}
