package test;

import java.util.Scanner;

public class TCS
{
	   public static void main(String args[])
	    {
		   /*
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter a string for matching");
	     String str1=sc.nextLine();
	  
	     
	      String str[]= {"Ashutosh","Amish","Surbhi","Suprita","Anju"};
	      System.out.println(str[0]);
	      for(int i=0;i<5;i++)
	      {
	    	  if(str[i].equals(str1))
	    	  {
	    		  System.out.println("String match found");
	    		  break;
	    	  } 
	    	  else 
	    	  {
	    		  System.out.println("not");
	    	  }
	      }
	    }
	    */
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter string for match");
		 String str[]= {"Ashutosh","Amish","Ajay","Anju","ritu","patibha"};
		 
		 //System.out.println(str[0]);
		 String str1=sc.nextLine();
		 
		 for(int i=0;i<str.length;i++)
		 {
			 if(str1.equals(str[i]))
			 {
				 System.out.println("match found");
				 break;
			 }
			 else
			 {
				// System.out.println("not found");
			 }
		 }
				   
			   
				   
}
}