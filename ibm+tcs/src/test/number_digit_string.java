package test;
import java.util.*;
public class number_digit_string 
{
/*	public static void main(String args[])
	{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a number");
 int num=sc.nextInt();
 int num1=0;
 int temp;
 while(num!=0)
 {
	 temp=num%10;
	 num1=num1*10+temp;
	 num=num/10;
 }

 int temp1;
 while(num1!=0)
 {
	 temp1=num1%10;
	 switch(temp1)
	 {
	 case 1:
		 System.out.print("one ");
		 break;
	 case 2:
		 System.out.print("two ");
		 break;
	 case 3:
		 System.out.print("three ");
		 break;
	 case 4:
		 System.out.print("four ");
		 break;
	 case 5:
		 System.out.print("five ");
		 break;
	 case 6:
		 System.out.print("six ");
		 break;
	 case 7:
		 System.out.print("seven ");
		 break;
	 case 8:
		 System.out.print("eight ");
		 break;
	 case 9:
		 System.out.print("nine ");
		 break;
     default :
    	 System.out.println();
    	 break;
	 }
	 num1=num1/10;
 }
}
*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int num1=num;
		int temp=0;
		int rev=0;
		     while(num1!=0)
		     {
		    	 temp=num1%10;
		    	 rev=rev*10+temp;
		    	 num1=num1/10;
		     }
		System.out.println(+rev);
	
	          while(rev!=0)
	           {
	    	     int temp2;
	    	     temp2=rev%10;
	    	    switch(temp2)
	    	    {
	    	    case 1:
	    	    	System.out.println("one");
	    	    	break;
	    	    case 2:
	    	    	 System.out.print("two");
	    	    	 break;
	    	     case 3:
	    			 System.out.print("three ");
	    			 break;
	    		 case 4:
	    			 System.out.print("four ");
	    			 break;
	    		 case 5:
	    			 System.out.print("five ");
	    			 break;
	    		 case 6:
	    			 System.out.print("six ");
	    			 break;
	    		 case 7:
	    			 System.out.print("seven ");
	    			 break;
	    		 case 8:
	    			 System.out.print("eight ");
	    			 break;
	    		 case 9:
	    			 System.out.print("nine ");
	    			 break;
	    	     default :
	    	    	 System.out.print("");
	    	    	 break;
	    		 }
	    	     rev=rev/10;
	    	     }
	            }
}
