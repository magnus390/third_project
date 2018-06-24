import java.util.Scanner;
class FirstandLastDigit
{
	public static void main(String args[])
	{
		int t,n,ans;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			n = sc.nextInt();
			ans = n%10;
			while(n!=0)
			{
				if(n%10==n)
				{
					ans = ans + n%10;
				}
				n = n/10;
			}
			System.out.println(ans);
		}
	}
}