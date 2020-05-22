import java.io.*;
import java.util.*;

class cheftuples
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
if(t>=1 && t<=20)
{
	for(int k=0;k<t;k++)
	{
		String str=sc.nextLine();
		String s[]=str.split(" ");
		int a[]=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			a[i]=Integer.parseInt(s[i]);
		}
		if(a[0]>=1 && a[0]<=1000000000 && a[1]>=1 && a[1]<=1000000 && a[2]>=1 && a[2]<=1000000 && a[3]>=1 && a[3]<=1000000)
		{
		for(int i=1;i<a[0];i++)
		{
			if(a[0]%i==0)
				
		}
		}
	}
}