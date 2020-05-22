import java.io.*;
import java.util.*;

class chef
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
if(t>=1 && t<=200)
{
for(int k=0;k<t;k++)
{
String  s=sc.nextLine();
String str[] = s.split(" ");
String a[]=new String[str.length];
for (int i=0; i<4; i++) 
{
a[i]=str[i];
}
String s1=sc.nextLine();
String str1[]=s1.split(" ");
String b[]=new String[str1.length];
for (int i=0; i<4; i++) 
{
b[i]=str1[i];
}
int c=0;
for(int i=0;i<4;i++)
{
if(a[i].length()>=2 && a[i].length()<=10 && b[i].length()>=2 && b[i].length()<=10)
c++; 
}

if(c==4)
{
c=0;
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
if(a[i].equals(b[j]))
c++;
}
}

if(c>=2)
System.out.println("Similar");
else
System.out.println("Dissimilar");
}
}
}
}
}