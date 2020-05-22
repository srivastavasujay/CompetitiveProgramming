import java.io.*;
import java.util.*;

class chefcookoff
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
int count=0;
int re[]=new int[t];
String r[]={"Beginner","Junior Developer","Middle Developer","Senior Developer","Hacker","Jeff Dean"};
if(t>=1 && t<=5000)
{
for(int k=0;k<t;k++)
{
	count=0;
String  s=sc.nextLine();
String str[] = s.split(" ");
int a[]=new int[str.length];
for (int i=0; i<str.length; i++) 
{
a[i]=Integer.parseInt(str[i]);
}
for(int i=0;i<a.length;i++)
{
	if(a[i]>=0 && a[i]<=1)
	{
		if(a[i]==1)
			count++;
	}
}
re[k]=count;
}
}
for(int i=0;i<t;i++)
{
	System.out.println(r[re[i]]);
}
}
}
