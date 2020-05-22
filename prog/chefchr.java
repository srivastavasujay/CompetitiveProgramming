import java.io.*;
import java.lang.*;
import java.util.*;

class chefchr
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String s[]=new String[t];
		int sum=0,count=0;
		String b[]=new String[24];
		int check=0;

	{
		char a[]={'c','h','e','f'};
		int n=a.length;
		char perm[]=new char[4];
		int m=0,c=0,j=1;
		String q;

		for(int i=0;i<24;i++)
		{
			for(int p=0;p<4;p++)
			{
				perm[p]=a[p];
			}
			int k=0;
			while(k<6)
			{
				while(j<(n-1))
				{
					q=new String(perm);
					b[c++]=q;
					{
						char temp=perm[j];
						perm[j]=perm[j+1];
						perm[j+1]=temp;
					}
					j++;
					k++;
				}
				j=1;
			}
			m++;

			if(m==n)
				break;

			char t1=a[0];
			a[0]=a[m];
			a[m]=t1;
		}
	}

		if(t>=1 && t<=200000)
		{
			for(int i=0;i<t;i++)
			{
				count=0;
				String str=sc.next();
				int l=str.length();
				sum=sum+l;
				check=0;
				if(l>=1 && l<=2000)
				{	
					for(int j=0;j<str.length();j++)
					{
						char ch=str.charAt(j);
						if(ch<97 || ch>122)
						{
							check=1;
							break;
						}
					}
					if(check==0)
					{
					{
						for(int j=0;j<24;j++)
						{
							int in=str.indexOf(b[j]);
									if(in>=0)
								{		
									count++;
									int lin=str.indexOf(b[j],(in+1));
									while(lin!=(-1))
								{	
									lin=str.indexOf(b[j],(in+1));
									if(lin==(-1))
									break;
									else
									{
									count++;
									in=lin;
									}
								}
							}
						}
						if(count>0)
							s[i]="lovely "+count;
						else
							s[i]="normal";
					}
					}
				}
			}
		}
		if(check==0)
		{
		if(sum>=1 && sum<=2000)
		{
			for(int i=0;i<t;i++)
			{
				System.out.println(s[i]);
			}
		}
	}
	}
}