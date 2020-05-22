import java.util.*;
import java.io.*;

class TestClass 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0,c=0;
        LinkedList su=new LinkedList();
        String s=sc.nextLine();
        String str[]=s.split(" ");
        int a[]=new int[2];
        for(int i=0;i<str.length;i++)
        {
            a[i]=Integer.parseInt(str[i]);
        }
        
        if(a[0]>=1 && a[0]<=100000000)
        {
            if(a[1]>=1 && a[1]<=100000)
            {
        
        String s1=sc.nextLine();
        String str1[]=s1.split(" ");
        int a1[]=new int[str1.length];
        for(int i=0;i<str1.length;i++)
        {
            a1[i]=Integer.parseInt(str1[i]);
        }
        
        for(int i=0;i<a[1];i++)
        {
            String s2=sc.nextLine();
            String str2[]=s2.split(" ");
            int a2[]=new int[str2.length];
            for(int j=0;j<str2.length;j++)
        {
            a2[j]=Integer.parseInt(str2[j]);
        }
        
        if(a1[i]>=1 && a1[i]<=100000 && a2[0]>=1 && a2[0]<=100000 && a2[1]>=1 && a2[1]<=100000)
        {
        if(a2[0]==1)
        a1[a2[1]]=a2[2];
        
        if(a2[0]==2)
        {
            sum=0;
            if(a[1]<a1.length && a[2]<a1.length)
            {
            c++;
            for(int k=a[1];k<a[2];k++)
            {
                sum=sum+k;
            }
            su.add(sum);
            }
            else
            {
                su.add("-1");
            }
        }
        }
        }
            }
        }
    }
}
