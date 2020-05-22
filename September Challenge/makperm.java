import java.io.*;
import java.util.*;

class makperm
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int sum=0;
    int re[]=new int[t];
    if(t>=1 && t<=100)
    {
      for(int k=0;k<t;k++)
      {
      int n=sc.nextInt();
      if(n>=1 && n<=100000)
      {
        sum+=n;
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          if(a[i]>=1 && a[i]<=1000000000)
            continue;
        }
          int count[]=new int[n+1];
          int c=0;

          for(int i=0;i<n;i++)
          {
            if(a[i]>n)
              c++;
            else
            {
            if(count[a[i]]==1)
              c++;
            else
              count[a[i]]++;
            }
          }
          re[k]=c;
      }
      }
    }
    if(sum<=200000)
    {
      for(int i=0;i<t;i++)
      {
      System.out.println(re[i]);
      }
    }
  }
}
