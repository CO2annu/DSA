public class mergesort
{
	 static void merge(int a[] , int p , int q , int r)
	 {
		 int n1 = q-p+1;
		 int n2 = r-q;
		 int l[] = new int[n1];
		 int R[] = new int[n2];
		 for(int i=0;i<n1;i++)
			 l[i] = a[p+i];
		 for(int j=0;j<n2;j++)
			R[j] = a[q+1+j];
		int i=0 , j=0;
		int k = p;
		while(i<n1 && j<n2)
		{
			if(l[i]<=R[j])
			{
				a[k] = l[i];
				i++;
			}
			else
			{
				a[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k++] = l[i++];
		}
		while(j<n2)
		{
			a[k++] = R[j++];
		}
	
	 }
	 static void divide(int a[] , int p ,  int r)
	 {
		 if(p<r)
		 {
			int q = p +(r - p)/2;
			divide(a , p , q);
			divide(a , q+1 , r);
			merge(a , p , q , r);
		 }
	 }
	public static void main(String[] args)
	{
		int a[] = {3,4,8,2,8,5,7,9};
		divide(a , 0 , a.length-1);
		for(int x=0;x<a.length;x++)
			System.out.println(a[x]);
	}
}