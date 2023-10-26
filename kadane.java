public class kadane
{
	static int maxsum(int[] a)
	{
		int max = 0;
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = Math.max(sum + a[i] , a[i]);
			max  = Math.max(sum , max);
		}
		return max;
	}
	public static void main(String[] args)
	{
		int a[] = {30,-40,20,40};
		int sum = maxsum(a);
		System.out.println(sum);
	}
}