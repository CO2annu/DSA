public class selectionsort
{
	public static void main(String[] args)
	{
		int a[] = {3,2,7,5,9,1,8,0,6,4,3};
		for(int i=0;i<a.length-1;i++)
		{
			int small = i;
			for( int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[small])
				{
					small = j;
				}
			}
			int temp = a[i];
			a[i] = a[small];
			a[small] = temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
	}
}