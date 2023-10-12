public class bubblesort
{
	public static void main(String[] args)
	{
		int a[] = {9,8,2,4,6,7};
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		System.out.print(a[i]);
	}
	
}