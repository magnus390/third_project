import java.util.*;
import java.io.*;
import java.lang.*;
class SnakesMongoosesandtheUltimateElection
{	
	public static void main(String args[])
	{
		int t;
		String s;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t!=0)
		{
			int snakes = 0,mongooses = 0;
			t = t - 1;
			s = sc.next();
			for(int i=1;i<s.length();i++)
			{
				if((s.charAt(i-1)=='s' && s.charAt(i)=='m') || (s.charAt(i-1)=='m' && s.charAt(i)=='s'))
				{
					s.setCharAt(i-1,'m');
					s.setCharAt(i,'m');
					i++;
				}
			}
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='s')
					snakes++;
				else
					mongooses++;
			}
			if(snakes>mongooses)
				System.out.println("snakes");
			else if(snakes<mongooses)
				System.out.println("mongooses");
			else
				System.out.println("tie");
		}
	}
}