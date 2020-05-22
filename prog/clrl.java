import java.io.*;
import java.util.*;
class clrl
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=1;
if(sc.hasNextInt())
t=sc.nextInt();
int s=0;
int a[]=new int[2];
String s[]=new String[t];

if(t>=1 && t<=50)
{
for(int i=0;i<t;i++)
{
String  lines = br.readLine();    

String[] strs = lines.trim().split("\\s+");

for (int p = 0; p < strs.length; p++) 
{
a[p] = Integer.parseInt(strs[p]);
}
int n=a[0];s=s+n;
int r=a[1];
int b[]=new int[n];

if(n>=1 && n<=20)
{
if(s>=1 && s<=1500000)
{
String  lin = br.readLine();    

String[] str = lin.trim().split("\\s+");

for (int q = 0; q < str.length; q++) 
{
b[q] = Integer.parseInt(str[q]);
}

for(int j=0;j<n;j++)
{
for(int k=j+1;k<n;k++)
{
if(b[j]>=1 && b[j]<=1000000000)
{
if(b[j]==b[k])
s[i]="NO";
}
else
s[i]="NO";
}
}



}
}
}
}
}
}