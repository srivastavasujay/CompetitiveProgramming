import java.io.*;
import java.util.*;

class spread2
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int re[]=new int[t];
      int sum=0;

      if(t>=1 && t<=1000)
      {
        for(int k=0;k<t;k++)
        {
          int n=sc.nextInt();
          sum+=n;
          if(n>=2 && n<=100000)
          {
            int a[]=new int[n];
            int c=0;
            for(int i=0;i<n;i++)
            {
              a[i]=sc.nextInt();
              if(a[i]>=0 && a[i]<=n)
                c++;
            }
            if(c==n)
            {
              if(a[0]>=1)
              {
                int count=0,day=0,s=0;
                while(count+1<n)
                {
                  s=0;
                  for(int i=0;i<=count;i++)
                  {
                    s+=a[i];
                  }
                  count+=s;
                  day++;
                }
                re[k]=day;
              }
            }
          }
        }
      }
      if(sum<=1000000)
      {
        for(int i=0;i<t;i++)
        {
          System.out.println(re[i]);
        }
      }
  }
}
