import java.io.*;
import java.util.*;

class atm2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String re[]=new String[t];
    if(t>=1 && t<=100)
    {
      for(int k=0;k<t;k++)
      {
      re[k]="";
      int n=sc.nextInt();
      int ka=sc.nextInt();
      int a[]=new int[n];
      if(n>=1 && n<=100)
      {
        if(ka>=1 && ka<=1000000)
        {
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        if(a[i]>=1 && a[i]<=1000000)
          continue;
        }
        for(int i=0;i<a.length;i++)
        {
          if(a[i]<=ka)
          {
            ka=ka-a[i];
            re[k]+="1";
          }
          else
            re[k]+="0";
        }
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
