import java.util.Scanner;
class sparseArray  
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
			str[i]=sc.next();
		int q=sc.nextInt();
		String qry[]=new String[q];
		int ans[]=new int[q];
		for(int i=0;i<q;i++)
			qry[i]=sc.next();
		for(int i=0;i<q;i++)
		{
			for(int j=0;j<n;j++){
				if(str[j].equals(qry[i]))
					ans[i]++;
			}
		}
		for(int i=0;i<q;i++)
			System.out.println(ans[i]);
	}
}
