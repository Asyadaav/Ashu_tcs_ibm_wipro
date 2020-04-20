package ibm;
import java.util.*;
public class String_concatenates
{
	//strcat(string1,string2) is a C standard function 
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two string");
	String str=sc.nextLine();
	String str1=sc.nextLine();
	   //using function
	  //str1=str.concat(str1);
	  //System.out.println(str1);
	
	
	  //using without function
	  int num=str.length();
	  int num1=str1.length();
	 
	  String ashu="";
	  for(int i=0;i<num;i++)
	  {
		  ashu=ashu+str.charAt(i);
	  }
	 
	  for(int i=0;i<num1;i++)
	  {
		  ashu=ashu+str1.charAt(i);
	  }
	  System.out.println(ashu);
}
}
