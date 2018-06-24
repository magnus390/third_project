import java.util.*;
class Greedy_puppy
{
	public static void main(String args[])
	{
		int t,n,k;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int ans = -1;
			n = sc.nextInt();
			k = sc.nextInt();
			while(k>0)
			{
				if(ans<n%k)
				{
					ans = n%k;
				}
				k--;
			}
			System.out.println(ans);
		}
	}
}