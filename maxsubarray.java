import java.util.*;
public class maxsubarray
{
	static int maxcrossingarray(int a[] , int start , int end , int mid)
	{
		int sum = 0;
		int leftsum = Integer.MIN_VALUE;
		for(int i=mid;i>=start;i--)
		{
			sum = sum + a[i];
			if(leftsum<sum)
				leftsum = sum;
		}
		sum = 0;
		int rightsum = Integer.MIN_VALUE;
		for(int i = mid+1;i<end;i++)
		{
			sum = sum + a[i];
			if(sum>rightsum)
				rightsum = sum;
		}
		return Math.max(leftsum + rightsum  , Math.max(leftsum , rightsum));
	}
	public static void main(String[] args)
	{
		int a[] = {13,-3,-25,-20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		int n = a.length;
		int start = 0,end = n-1 , mid = (start+end)/2;
		int b = maxcrossingarray(a , start , end , mid);
		System.out.println(b);
		
	}
}