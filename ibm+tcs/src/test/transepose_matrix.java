package test;

public class transepose_matrix {
	public static void main(String args[])
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[3][3];
		System.out.println("original matrix is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			
			 System.out.print(+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("transepose matrix is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			 b[i][j]=a[j][i];
			 System.out.print(+b[i][j]);
			}
			System.out.println();
		}
	}

}
