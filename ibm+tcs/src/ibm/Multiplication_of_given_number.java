package ibm;
import java.util.*;
public class Multiplication_of_given_number
{
	public static void main(String args[])
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("enter  a number for multiplication");
       int num=sc.nextInt();
       int mul=0;
       for(int i=1;i<=10;i++)
       {
    	   mul=num*i;
    	   System.out.println(+num+"*"+i+"="+mul);
       }
     }
}
