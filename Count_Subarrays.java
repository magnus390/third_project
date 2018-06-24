import java.util.Scanner;
class Count_Subarrays
{
	public static void main(String args[])
	{
		int t,n,num,temp,counter,ans;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			ans = 0;
			counter = 1;
			n = sc.nextInt();
			temp = sc.nextInt();
			for(int j=1;j<n;j++)
			{	
				num = sc.nextInt();
				if(temp<=num)
				{	
					counter++;
				}
				else
				{
					ans = ans + (counter*(counter-1))/2;
					counter = 1;
				}
				temp = num;
			}
			if(counter!=1)
			{
				ans = ans + (counter*(counter-1))/2;
			}
			ans = ans + n;
			System.out.println(ans);
		}
	}
}