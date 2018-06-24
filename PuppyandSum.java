import java.util.Scanner;
class PuppyandSum
{
	public static void main(String args[])
	{
		int t,d,n,ans = 0;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			d = sc.nextInt();
			n = sc.nextInt();
			for(int j=0;j<d;j++)
			{
				ans = (n = n*(n+1)/2);
			}
			System.out.println(ans);
		}
	}
}