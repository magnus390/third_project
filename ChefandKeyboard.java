import java.util.Scanner;
class ChefandKeyboard
{
	public static void main(String arg[])
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t!=0)
		{
			t = t - 1;
			int n = sc.nextInt();
			int m = sc.nextInt();
			int c = sc.nextInt();
			int ans = 0,temp;
			if(n<m)
			{
				for(int i=1;i<=n;i++)
				{
					if(c%i==0)
					{
						temp = c/i;
						if(temp<=m)
							ans++;
					}
				}
			}
			else
			{
				for(int i=1;i<=m;i++)
				{
					if(c%i==0)
					{
						temp = c/i;
						if(temp<=n)
							ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}