import java.util.Scanner;
class Chefandhisdailyroutine
{
	public static void main(String arg[])
	{
		int t;
		String s;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t!=0)
		{
			t = t - 1;
			int flag = 1;
			s = sc.next();
			for(int i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)>s.charAt(i+1))
				{
					flag = 0;
					break;
				}
			}	
			if(flag==0)
				System.out.println("no");
			else
				System.out.println("yes");
		}
	}
}