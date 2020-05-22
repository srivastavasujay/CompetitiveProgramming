import java.io.*;
import java.util.*;

class minvote
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
String re[]=new String[t];
int sum=0;
if(t>=1 && t<=100000)
{
	for(int k=0;k<t;k++)
	{
		int c=0,sum1=0,count=0;
		int n=sc.nextInt();
		sc.nextLine();
		sum+=n;
		if(n>=1 && n<=500)
		{
			String s=sc.nextLine();
			String s1[]=s.split(" ");
			int a[]=new int[s1.length];
			for(int i=0;i<s1.length;i++)
			{
				a[i]=Integer.parseInt(s1[i]);
				if(a[i]>=1 && a[i]<=1000000000)
					count++;
			}
			String str="";
			if(count==a.length)
			{
			for(int i=0;i<a.length;i++)
			{
				c=0;
				for(int j=0;j<a.length;j++)
				{
					sum1=0;
					if(i!=j)
					{
						if(i<j)
						{
							if((j-i)==1)
								c++;
							else
							{
								for(int p=(i+1);p<j;p++)
								{
									sum1+=a[p];
								}
								if(sum1<=a[j])
									c++;
							}
						}
						else
						{
							if((i-j)==1)
								c++;
							else
							{
								for(int p=(j+1);p<i;p++)
								{
									sum1+=a[p];
								}
								if(sum1<=a[j])
									c++;
							}
						}
					}
				}
				str=str+Integer.toString(c)+" ";
			}
		}
			re[k]=str.trim();
		}
	}
}
if(sum<10000)
{
for(int i=0;i<t;i++)
{
	System.out.println(re[i]);
}
}
}
}
