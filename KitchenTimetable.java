import java.util.Scanner;
class KitchenTimetable
{	
	public static void main(String args[])
	{
		int t,n,b;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t!=0)
		{
			int ans = 0;
			t = t - 1;
			n = sc.nextInt();
			int a[] = new int[n+1];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				b = sc.nextInt();
				if(i==0)
				{
					if(b<=a[i])
						ans++;
				}
				else
				{
					if(a[i] - a[i-1]>=b)
						ans++;
				}
			}
			System.out.println(ans);
		}
	}
}