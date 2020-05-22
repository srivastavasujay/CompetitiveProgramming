import java.io.*;
import java.util.*;

class mock
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String b[]=str.split(" ");
int a[]=new int[b.length];

for(int i=0;i<b.length;i++)
{
a[i]=Integer.parseInt(b[i]);
}

int arr[]=new int[20];
int pos=0;

for(int i=0;i<6;i++)
{
if(a[i]>=0 && a[i]<=1000)
{
for(int j=i+1;j<6;j++)
{
for(int k=j+1;k<6;k++)
{
arr[pos]=a[i]+a[j]+a[k];
pos++;
}
}
}
}
int c=0;
for(int i=0;i<20;i++)
{
for(int j=i+1;j<20;j++)
{
if(arr[i]==arr[j])
c++;
}
}


if(c>0)
System.out.println("YES");
else
System.out.println("NO");

}
}