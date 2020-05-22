import java.io.*;
import java.util.*;

class chefadv
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String re[]=new String[t];
    if(t>=1 && t<=1000)
    {
      for(int k=0;k<t;k++)
      {
      int n=sc.nextInt();
      int m=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();

      if(n>=1 && n<=100 && m>=1 && m<=100 && x>=1 && x<=100 && y>=1 && y<=100)
      {
        if(n==2 && m==2)
          re[k]="Chefirnemo";
        else
        {
        int a=1,b=1,n1=0,n2=0,m1=0,m2=0;
        if(n<x && n==2)
        {
          n2=1;
        }
        if(m<y && m==2)
        {
          m2=1;
        }
        while(true)
        {
          a+=x;
          b+=y;
          if(a==n)
            n1=1;
          else if(a==n-1)
            n2=1;
          if(b==m)
            m1=1;
          else if(b==m-1)
            m2=1;
          if(a>n && b>m)
            break;
        }
        if((n1==1 && m1==1) || (n2==1 && m2==1))
          re[k]="Chefirnemo";
        else
          re[k]="Pofik";
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
