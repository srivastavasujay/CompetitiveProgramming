import java.io.*;
import java.util.*;

class twovsten
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int re[]=new int[t];
		if(t>=1 && t<=1000)
		{
			for(int i=0;i<t;i++)
			{
				int c=0;
				int x=sc.nextInt();
				if(x>=0 && x<=1000000000)
				{
					if((x%2)==0 || (x%5)==0)
					{
						while((x%10)!=0)
						{
							x=x*2;
							c++;
						}
						re[i]=c;
					}
					else
						re[i]=-1;
				}
			}
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(re[i]);
		}
	}
}