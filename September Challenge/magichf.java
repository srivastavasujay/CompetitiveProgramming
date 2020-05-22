import java.io.*;
import java.util.*;

class magichf
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int re[]=new int[t];
    int sum=0;
    if(t>=1 && t<=100)
    {
      for(int k=0;k<t;k++)
      {
      int n=sc.nextInt();
      if(n>=2 && n<=100000)
      {
        int x=sc.nextInt();
        int s=sc.nextInt();
        sum+=s;
        int coin=x;
        if(s>=1 && s<=10000)
        {
          for(int i=0;i<s;i++)
          {
              int a=sc.nextInt();
              int b=sc.nextInt();
              if(a>=1 && a<=n && b>=1 && b<=n && a!=b)
              {
                if(a==coin)
                  coin=b;
                else if(b==coin)
                  coin=a;
              }
          }
          re[k]=coin;
        }
      }
      }
    }
    if(sum<200000)
    {
      for(int i=0;i<t;i++)
      {
        System.out.println(re[i]);
      }
    }
  }
}
