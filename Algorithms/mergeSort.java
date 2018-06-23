import java.util.Scanner;
class mergeSort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sort(a,0,n-1);
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	static void sort(int a[],int p,int r)
	{
		int q=(p+r)/2;
		if(p<r)
		{
			sort(a,p,q);
			sort(a,q+1,r);
			merge(a,p,q,r);
		}
	}
	static void merge(int a[],int p,int q,int r)
	{
		int i=0,j=0;
		int l1[]=new int[q-p+1];
		int l2[]=new int[r-q];
		for(i=p,j=0;i<=q;i++,j++)
			l1[j]=a[i];
		for(i=q+1,j=0;i<=r;i++,j++)
			l2[j]=a[i];
		i=j=0;
		int k=p;
		while(i<=q-p && j<r-q)
		{
			if(l1[i]<l2[j]){
				a[k]=l1[i];
			i++;}
			else{
				a[k]=l2[j];
			j++;}
			k++;
		}
		for(int l=i;l<=q-p;l++){
			a[k]=l1[l];
			k++;
		}
		for(int l=j;l<r-q;l++){
			a[k]=l2[l];
		k++;
		}
	}
}		
				
			
