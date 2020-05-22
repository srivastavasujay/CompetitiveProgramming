import java.io.*;
import java.util.*;

class chocoland
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int r[]=new int[t];
sc.nextLine();
if(t>=1 && t<=100)
{
for(int k=0;k<t;k++)
{
int count=0;
String  s=sc.nextLine();
String str[] = s.split(" ");
int a[]=new int[str.length];
for (int i=0; i<str.length; i++) 
{
a[i]=Integer.parseInt(str[i]);
}

if(a[0]>=1 && a[0]<=100 && a[1]>=1 && a[1]<=100 && a[2]>=1 && a[2]<=1000)
{
if(a[1]>a[0])
r[k]=-1;
else
{
if(a[0]/a[1]==1 && (a[2]>=7))
r[k]=-1;
else
{
for(int i=1;i<=a[2];i++)
{
if(i%7!=0)
{
count+=a[1];
}
}
if(count>a[0])
{
r[k]=(count/a[0])+1;
}
else
r[k]=0;
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
}

