import java.util.Scanner;
class MinimumMaximum
{
	public static void main(String arg[])
	{
		long t,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long min = Integer.MAX_VALUE,num;
			n = sc.nextInt();
			for(int j=0;j<n;j++)
			{
				num = sc.nextInt();
				if(min>num)
					min = num;
			}
			System.out.println((n-1)*min);
		}
	}
}