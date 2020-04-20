package test;
import java.util.*; 
public class temprature 
{
public static void main(String args[])
{
	System.out.println("enter the value of temprature in feherenhite");
	Scanner sc=new Scanner(System.in);
	double f=sc.nextDouble();
	double cel;
    cel=(5.0/9)*(f-32);
    System.out.println("th etemptature in celceuis is  "+cel);
	
}
}
