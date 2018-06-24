import java.util.Scanner;
class ChefandFruits
{
	public static void main(String args[])
	{
		int t,app,ora,coin;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			app = sc.nextInt();
			ora = sc.nextInt();
			coin = sc.nextInt();
			if(coin>=Math.abs(app-ora))
				System.out.println(0);
			else
			{
				System.out.println(Math.abs(app-ora) - coin);
			}
		}
	}
}