import java.io.*;
import java.util.*;

class chefprms
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    chefprms ob=new chefprms();
    int t=sc.nextInt();
    String re[]=new String[t];
    if(t>=1 && t<=200)
    {
      for(int k=0;k<t;k++)
      {
        int n=sc.nextInt();
        int c=0;
        if(n>=1 && n<=200)
        {
          for(int i=2;i<=(n/2);i++)
          {
            if(ob.check(i)==1)
            {
              if(ob.check(n-i)==1)
              {
                re[k]="YES";
                c=1;
                break;
              }
            }
          }
          if(c==0)
            re[k]="NO";
        }
      }
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(re[i]);
    }
  }
  int check(int a)
  {
    int c=0;
    int prime[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
    for(int i=0;i<prime.length-1;i++)
    {
      for(int j=i+1;j<prime.length;j++)
      {
        if((prime[i]*prime[j])==a)
        {
          c=1;
          break;
        }
      }
    }
    return c;
  }
}
