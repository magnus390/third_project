import java.util.Scanner;
class ChefandtheWildcardMatching
{	
	public static void main(String args[])
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		String s1,s2;
		for(int i=0;i<t;i++)
		{
			int flag = 1;
			s1 = sc.next();
			s2 = sc.next();
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)!='?' && s2.charAt(j)!='?')
				{
					if(s1.charAt(j)!=s2.charAt(j))
					{
						flag = 0;
					}
				}
			}
			if(flag==1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}