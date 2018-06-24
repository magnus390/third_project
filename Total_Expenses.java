import java.util.*;
class Total_Expenses
{
	public static void main(String arg[])
	{
		float ans;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			float quantity = sc.nextFloat();
			float price = sc.nextFloat();
			if(quantity>1000)
			{ 
				ans = (9*quantity*price)/10;
			}
			else
			{
				ans = quantity*price;
			}
			System.out.printf("%.6f\n",ans);
		}
	}
}