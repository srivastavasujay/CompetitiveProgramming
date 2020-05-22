import java.io.*;
import java.util.*;

class xorier
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int re[]=new int[t];
    xorier ob=new xorier();
    if(t>=1 && t<=10)
    {
      for(int k=0;k<t;k++)
      {
      int n=sc.nextInt();
      int a[]=new int[n];
      if(n>=1 && n<=1000)
      {
        int c=0;
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          if(a[i]>=1 && a[i]<=1000000)
            c++;
        }
        if(c==n)
        {
        int count=0;
        for(int i=0;i<a.length-1;i++)
        {
          for(int j=i+1;j<a.length;j++)
          {
            int xor=a[i] ^ a[j];
            //System.out.println(xor);
            if(xor==4)
              count++;
            else
            {
            for(int p=2;p<=xor/2;p++)
            {
              //System.out.println(ob.checkprime(xor));
              if(ob.checkprime(p)==true)
              {
                if(ob.checkprime(xor-p)==true)
                {
                  if((p!=2 && (xor-p)!=2))
                  {
                    //System.out.println(p);
                    //System.out.println(xor-p);
                    count++;
                    //System.out.println(".");
                    break;
                  }
                }
              }
              }
            }
          }
        }
        re[k]=count;
        }
      }
      }
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(re[i]);
    }
  }
  boolean checkprime(int a)
  {
    boolean isprime=true;
    for(int i=2;i<=a/2;i++)
    {
      if(a%i==0)
      {
        isprime=false;
        break;
      }
    }
    return isprime;
  }
}
