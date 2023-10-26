public class heapsort
{
	static void maxheap(int[] a , int heapsize , int i)
	{
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		if(l<heapsize && a[largest] < a[l])
		{
			largest = l;
		}
		if(r<heapsize && a[r]>a[largest])
		{
			largest = r;
		}
		if(largest!=i)
		{
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxheap(a,heapsize,largest);
		}
	}
	static void buildheap(int[] a , int n)
	{
		int root = n/2-1;
		for(int i=root;i>=0;i--)
		{
			maxheap(a, n ,i);
		}
		for(int i=n-1;i>=0;i--)
		{
			int swap = a[i];
			a[i] = a[0];
			a[0] = swap;
			maxheap(a , i , 0);
		}
	}
	public static void main(String[] args)
	{
		int a[] = {5,13,2,25,7,17,20,8,4};
		int n = a.length;
		buildheap(a, n);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}