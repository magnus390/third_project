import java.io.*;
import java.util.*;
class Turbo_sort
{
	public static void main(String arg[])
	{
		int t,i,j,temp;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		int a[] = new int[t+1];
		for(i=0;i<t;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=0;i<t;i++)
		{
			for(j=0;j<t-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(i=0;i<t;i++)
		{
			System.out.println(a[i]);
		}
	}
}