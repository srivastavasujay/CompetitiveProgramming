import java.io.*;
import java.util.*;

class lucky
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
if(n>=1 && n<=1018)
{
while(n>0)
{
int d=n%10;
if(d==4 || d==7)
count++;
n=n/10;
}
if(count==4 || count==7)
System.out.println("YES");
else
System.out.println("NO");
}
else
System.out.println("INVALID INPUT");
}
}