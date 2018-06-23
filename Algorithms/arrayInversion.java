import java.util.Scanner;
class arrayInversion
{
	static int c = 0;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		int p = 0,r = n-1;
		count(a,p,r);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println(c);
	}
	static void count(int a[],int p,int r)
	{
		int q = (p+r)/2;
		if(p<r)
		{
			count(a,p,q);
			count(a,q+1,r);
			mergeCountSplit(a,p,q,r);
		}
	}
	static void mergeCountSplit(int a[],int p,int q,int r)
	{
		int i = 0,j = 0;
		int l1[] = new int[q-p+1];
		int l2[] = new int[r-q];
		for(i=p,j=0;i<=q;i++,j++)
			l1[j] = a[i];
		for(i=q+1,j=0;i<=r;i++,j++)
			l2[j] = a[i];
		i = 0;
		j = 0;
		int k = p;
		while(i<q-p+1 && j<r-q)
		{
			if(l1[i] <= l2[j])
			{
				a[k] = l1[i];
				i++;
			}
			else
			{
				a[k] = l2[j];
				c += l1.length-i;
				j++;
			}
			k++;
		}
		while(i<q-p+1)
		{
			a[k] = l1[i];
			i++;
			k++;
		}
		while(j<r-q)
		{
			a[k] = l2[j];
			j++;
			k++;
		}
	}
}
		
		
	
