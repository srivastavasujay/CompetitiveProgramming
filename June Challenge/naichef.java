import java.io.*;
import java.util.*;

class naichef
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  sc.nextLine();
  double re[]=new double[t];
  if(t>=1 && t<=70)
  {
    for(int i=0;i<t;i++)
    {
      String str=sc.nextLine();
      String s[]=str.split(" ");
      int a[]=new int[s.length];
      for(int j=0;j<s.length;j++)
      {
        a[j]=Integer.parseInt(s[j]);
      }
      if(a[0]>=1 && a[0]<=10000 && a[1]>=1 && a[1]<=a[0] && a[2]>=1 && a[2]<=a[0])
      {
        int b[]=new int[a[0]];
        int c=0;
        String s1=sc.nextLine();
        String s2[]=s1.split(" ");
        for(int j=0;j<a[0];j++)
        {
          b[j]=Integer.parseInt(s2[j]);
            if(b[j]>=1 && b[j]<=a[0])
            c++;
        }
        if(c==a[0])
        {
          double prob=1.0000000000;
          for(int k=1;k<=2;k++)
          {
            int temp=a[k];
            int count=0;
            for(int j=0;j<b.length;j++)
            {
              if(temp==b[j])
              {
                count++;
              }
            }
            double te=(double)count/a[0];
            prob=prob*te;
            }
            re[i]=prob;
          }
        }
      }
  }
  for(int i=0;i<t;i++)
  {
    System.out.println(re[i]);
  }
}
}
