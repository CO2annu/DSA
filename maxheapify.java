public class maxheapify
{
	static void maxheap(int[] a , int i)
	{
		int l = 2*i+1;
		int r = 2*i+2;
		int largest;
		if(l<a.length && a[l]>a[i])
		{
			largest = l;
		}
		else 
		{
			largest = i;
		}
		if(r<a.length && a[r]>a[largest])
		{
			largest = r;
		}
		if(largest!=i)
		{
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxheap(a,largest);
		}
	}
	static void buildheap(int[] a)
	{
		int root = (a.length/2) - 1;
		for(int i = root;i>=0;i--)
		{
			maxheap(a , i);
		}
	}
	public static void main(String[] args)
	{
		int a[] = {16,4,10,14,7,9,3,2,8,1};
		int i = 0;
		buildheap(a);
		for(int j=0;i<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}
}