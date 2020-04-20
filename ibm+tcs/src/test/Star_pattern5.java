package test;

public class Star_pattern5 
{

	public static void main(String args[])
	{
	/* {
		
		 for(int i=1;i<=5;i++)
		 {
			boolean k = true;
			 for(int j=1;j<=9;j++)
			 {
				 if(j>=6-i && j<=4+i && k)
				 {
					System.out.print("*"); 
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
	 }*/
		boolean k=true;
		//int m=1;
	for(int i=1;i<=5;i++)
	{
		for (int j=1;j<=9;j++)
		{
			
			 
			if(j>=6-i && j<=4+i && k)
			{
				System.out.print("*");
				k=false;
				//m=1-m;
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