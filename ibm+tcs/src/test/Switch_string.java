package test;

import java.util.Scanner;

public class Switch_string 
{
	public static void main(String args[])
	{
		System.out.println("enter a string");
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();
 str=str.toLowerCase();
 
 //String c[]= sc.nextLine();
 for(int i=0;i<str.length();i++)
 switch(str.charAt(i))
 {
 case 'a':
	 System.out.print("1 ");
     break;
 case 'b':
	 System.out.print("2 ");
     break;
 case 'c':
	 System.out.print("3 ");
     break;
 case 'd':
	 System.out.print("4 ");
     break;
 case 'e':
	 System.out.print("5 ");
     break;
 case 'f':
	 System.out.print("6 ");
     break;
 case 'g':
	 System.out.print("7 ");
     break;
 case 'h':
	 System.out.print("8 ");
     break;
 case 'i':
	 System.out.print("9 ");
     break;
 case 'j':
	 System.out.print("10 ");
     break;
 case 'k':
	 System.out.print("11 ");
     break;
 case 'l':
	 System.out.print("12 ");
     break;
 case 'm':
	 System.out.print("13 ");
     break;
 case 'n':
	 System.out.print("14 ");
     break;
 case 'o':
	 System.out.print("15");
     break;
 case 'p':
	 System.out.print("16");
     break;
 case 'q':
	 System.out.print("17 ");
     break;
 case 'r':
	 System.out.print("18 ");
     break;
 case 's':
	 System.out.print("19 ");
     break;
 case 't':
	 System.out.print("20 ");
     break;
 case 'u':
	 System.out.print("21 ");
     break;
 case 'v':
	 System.out.print("22 ");
     break;
 case 'w':
	 System.out.print("23 ");
     break;
 case 'x':
	 System.out.print("24");
     break;
 case 'y':
	 System.out.print("25 ");
     break;
 case 'z':
	 System.out.print("26 ");
     break;
 default:
	 System.out.print("break");
	 break;
 }
	}
}
