import java.util.*;
public class insertionsort
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int a[] = new int[10] ;
		int i , k;
		for( i=0;i<10;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=1;i<10;i++)
		{
			 k = a[i];
			 int j = i;
			 while(j>0 && a[j-1] < k)
			 {
				 a[j] = a[j-1];
				 j--;
			 }
			 a[j] = k;
		}
		for( i=0;i<10;i++)
			System.out.print(a[i] +"\t");
		
	}
}