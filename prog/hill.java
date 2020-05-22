import java.io.*;
import java.util.*;

class hill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
int r[]=new int[t];
if(t>=1 && t<=100)
{
	for(int k=0;k<t;k++)
	{
		int c=0,count=0,para=0;
		String s=sc.nextLine();
		String st[]=s.split(" ");
		int a[]=new int[st.length];
		for (int i=0; i<st.length; i++) 
		{
			a[i]=Integer.parseInt(st[i]);
		}
		if(a[0]>=1 && a[0]<=100 && a[1]>=1 && a[1]<=1000000 && a[2]>=1 && a[2]<=1000000)
		{
			String s1=sc.nextLine();
			String str[]=s1.split(" ");
			int b[]=new int[str.length];
		for (int i=0; i<str.length; i++) 
		{
			b[i]=Integer.parseInt(str[i]);
			if(b[i]>=1 && b[i]<=1000000)
				c++;
		}
		if(c==a[0])
		{
			for(int i=0;i<(b.length-1);i++)
			{
				if(b[i+1]>b[i] && (b[i+1]-b[i])<=a[1])
					count++;
				else if(b[i]>b[i+1] && (b[i]-b[i+1])<=a[2])
					count++;
				else if(b[i]>b[i+1] &&(b[i]-b[i+1])>a[2] && para<1)
					{
						count++;
						para++;
					}
				else if(b[i]==b[i+1])
					count++;
				else
					break;
			}
			r[k]=count+1;
		}
		}
	}
}
for(int i=0;i<t;i++)
{
	System.out.println(r[i]);
}
}
}