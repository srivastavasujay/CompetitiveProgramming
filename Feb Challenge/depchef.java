import java.io.*;
import java.util.*;

class depchef
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int re[]=new int[t];
      if(t>=1 && t<=100)
      {
        for(int k=0;k<t;k++)
        {
          int n=sc.nextInt();
          if(n>=3 && n<=100)
          {
            int a[]=new int[n];
            int d[]=new int[n];
            int c=0;
            for(int i=0;i<n;i++)
            {
              a[i]=sc.nextInt();
              if(a[i]>=1 && a[i]<=10000)
                c++;
            }
            for(int i=0;i<n;i++)
            {
              d[i]=sc.nextInt();
              if(d[i]>=1 && d[i]<=10000)
                c++;
            }
            int flag=0,count=0;
            if(c==(2*n))
            {
              for(int i=0;i<n;i++)
              {
                if(i==0)
                {
                  if(a[n-1]<d[i] && a[i+1]<d[i] && (a[n-1]+a[i+1])<d[i])
                  {
                    flag=1;
                      if(count<d[i])
                        count=d[i];
                  }
                }
                else if(i==n-1)
                {
                  if(a[i-1]<d[i] && a[0]<d[i] && (a[i-1]+a[0])<d[i])
                  {
                    flag=1;
                      if(count<d[i])
                        count=d[i];
                  }
                }
                else
                {
                  if(a[i-1]<d[i] && a[i+1]<d[i] && (a[i-1]+a[i+1])<d[i])
                  {
                    flag=1;
                      if(count<d[i])
                        count=d[i];
                  }
                }
              }
              if(flag==1)
                re[k]=count;
              else
                re[k]=-1;
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
