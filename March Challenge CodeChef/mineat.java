import java.io.*;
import java.util.*;

class mineat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
int re[]=new int[t];
if(t>=1 && t<=10)
{
	for(int k=0;k<t;k++)
	{
		int c=0,sum=0;
		String s=sc.nextLine();
		String st[]=s.split(" ");
		int a[]=new int[st.length];
		for(int i=0;i<st.length;i++)
		{
			a[i]=Integer.parseInt(st[i]);
		}
		if(a[0]>=1 && a[0]<=100 && a[1]>=a[0] && a[1]<=1000000000)
		{
			String s1=sc.nextLine();
			String st1[]=s1.split(" ");
			int b[]=new int[st1.length];
			for(int i=0;i<st1.length;i++)
			{
				b[i]=Integer.parseInt(st1[i]);
				sum=sum+b[i];
				if(b[i]>=1 && b[i]<=1000)
					c++;
			}
			if(c==a[0])
			{
				if(sum%a[1]==0)
					re[k]=(sum/a[1]);
				else
					re[k]=(sum/a[1])+1;
			}
		}
	}
}
for(int i=0;i<t;i++)
{
	System.out.println(re[i]);
}
}
}