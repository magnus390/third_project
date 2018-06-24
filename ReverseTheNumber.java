import java.util.Scanner;
class ReverseTheNumber
{
	public static void main(String args[])
	{
		int t,n,ans;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			ans = 0;
			n = sc.nextInt();
			while(n!=0)
			{
				ans = ans*10;
				ans = ans + n%10;
				n = n/10;
			}
			System.out.println(ans);
		}
	}
}