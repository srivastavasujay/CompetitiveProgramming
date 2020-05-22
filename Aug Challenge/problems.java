import java.io.*;
import java.util.*;

class problems
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String ps1=sc.nextLine();
    String ps[]=ps1.split(" ");
    int a[]=new int[ps.length];
    for(int i=0;i<ps.length;i++)
    {
      a[i]=Integer.parseInt(ps[i]);
    }
    int re[]=new int[a[0]];
    int res[]=new int[a[0]];
    if(a[0]>=1 && a[0]<=100000)
    {
      for(int k=0;k<a[0];k++)
      {
        if(a[1]>=2 && a[1]<=30)
        {
          String sc1=sc.nextLine();
          String ns1=sc.nextLine();
          String sc=sc1.split(" ");
          String ns=ns1.split(" ");
          int b[]=new int[sc.length];
          int c[]=new int[ns.length];
          int count=0;
          for(int i=0;i<sc.length;i++)
          {
            b[i]=Integer.parseInt(sc[i]);
            c[i]=Integer.parseInt(ns[i]);

            if(b[i]>=1 && b[i]<=100 && c[i]>=1 && c[i]<=1000)
            count++;
          }
          if(count==(sc.length))
          {
            for(int i=0;i<(b.length-1);i++)
            {
              for(int j=i+1;j<b.lengthl;j++)
              {
                if(b[i]>b[j])
                {
                  int temp=c[i];
                  c[i]=c[j]
                  c[j]=temp;
                }
              }
            }
            int c1=0;
            for(int i=0;i<(c.length-1);i++)
            {
              if(c[i]>c[i+1])
                c1++;
            }
            re[k]=c1;
          }
        }
      }
      for(int i=0;i<(re.length-1);i++)
      {
        for(int j=0;j<re.length;j++)
        {
          if(re[i]<re[j])
        }
      }
    }
  }
}
