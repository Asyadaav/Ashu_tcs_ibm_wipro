package test;

import java.util.Scanner;

public class time {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String str = sc.nextLine();
		if(str.length()>=8 && str.length()<=15)
		{
			if((str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') ||
					(str.charAt(str.length()-1) >= 'A' && str.charAt(str.length()-1) <= 'Z'))
			{
			
			}
			else
			{
				System.out.println("Unsuccessful validation 1");
				System.exit(0);
			}
			int j=2;
			for(int i=1;i<str.length()-1;i++,j++)
			{
				
				if(j%2==0)
				{
					if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) 
				            || str.charAt(i) >= 97 && str.charAt(i) <= 122) 
					     continue;
					else
						System.out.println("Unsuccessful validation 1");
					System.exit(0);
				}
				else
				{
					if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
						continue;
						else
							System.out.println("Unsuccessful validation 2");
						System.exit(0);
				}
			}
			
         System.out.println("Successful validation");
		}
		else
			System.out.println("Unsuccessful first");
	}
}
				 


	
	


