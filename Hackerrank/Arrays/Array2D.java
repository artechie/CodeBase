import java.util.Scanner;
class Array2D
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[6][6];
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				a[i][j]=sc.nextInt();
		int s=0,k=0;
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
			{
				s=0;
				s+=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				if(i==0 && j==0)
					k=s;
				else
					k=(k<s)? s:k;
			}
			System.out.println(k);
	}
}
