import java.io.*;
import java.util.*;

class gamenumb
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
int r[]=new int[t];
int n=0,k=0;
if(t>=1 && t<=100)
{
	for(int k=0;k<t;k++)
	{
		int c=0,sum=0,c1=0;
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		int a[]=new int(s1.length);
		for(int i=0;i<s1.length;i++)
		{
			a[i]=Integer.parseInt(s1[i]);
		}
		n=n+a[0];
		k=k+a[1];
		if(a[0]>=1 && a[1]<=100000 && a[1]>=1 && a[2]<=100000)
		{
			String sa=sc.nextLine();
			String sd=sc.nextLine();
			String b1[]=sa.split(" ");
			String d1[]=sd.split(" ");
			int b[]=new int(b1.length);
			int d[]=new int(d1.length);
			for(int i=0;i<a[0];i++)
			{
				b[i]=Integer.parseInt(b1[i]);
				d[i]=Integer.parseInt(d1[i]);
				sum=sum+d[i];
				if(b[i]>=1 && b[i]<=100000 && d[i]>=1 && d[i]<=100000)
					c++;
			}
			if(c==a[0])
			{
				String sb=sc.nextLine();
				String sk=sb.split(" ");
				int c[]=new int(sk.length);
				for(int i=0;i<sk.length;i++)
				{
					c[i]=Integer.parseInt(sk[i]);
					if(c[i]>=1 && c[i]<=sum && c[i+1]<c[i])
						c1++;
				}
				if(c1==c.length)
				{
					int z[]=new int[sum];
					for(int i=0;i<a[0];i++)
					{
						for(int j=0;j<d[i];j++)
						{
							
						}
					}
				}
			}
		}
	}
}