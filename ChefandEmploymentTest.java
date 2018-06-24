import java.util.Scanner;
import java.util.Arrays;
class ChefandEmploymentTest
{	
	public static void main(String args[])
	{
		int t,n,k;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t!=0)
		{
			t = t - 1;
			n = sc.nextInt();
			k = sc.nextInt();
			int a[] = new int [n+1];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[(n+k+1)/2]);
		}
	}
}