package test;

public class star_pattern6 
{
	public static void main(String args[])
	 {
		
		 for(int i=1;i<=5;i++)
		 {int m=1;
			 boolean k = true;
			 for(int j=1;j<=9;j++)
			 {
				 if(j>=6-i && j<=4+i && k)
				 {
					 System.out.print(m); 
					m=1-m;
					
					k=false;
				 }
				 else
				 {
					 System.out.print(" ");
						k=true;
					 
				 }
				 
			 }
			 System.out.println();
		 }
	 }
}
