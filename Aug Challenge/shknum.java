import java.io.*;
import java.util.*;

class shknum
{
  int temp;
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    shknum ob=new shknum();
    int t=sc.nextInt();
    int re[]=new int[t];
    if(t>=1 && t<=1000)
    {
      for(int k=0;k<t;k++)
      {
      int num=sc.nextInt();
      int count=0;
      if(num>=1 && num<=1000000000)
      {
        int n=num;
        int num1=1;
        while(n!=1)
        {
          n=n/2;
          num1=num1*2;
        }
        int rem=num-num1;

        int cf=-1,cr=-1,rem1=rem;
        int c1=0,c2=0;
        int t1,t2;
        if(rem==0)
        re[k]=1;
        else
        {
        int res=ob.checknum(rem);

        if(res!=-1)
        re[k]=res;

        else if(res==-1)
        {
            while(cf==-1)
            {
              c1++;
              cf=ob.checknum(++rem);
            }
            t1=ob.temp;
            while(cr==-1)
            {
              c2++;
              cr=ob.checknum(--rem1);
            }
            t2=ob.temp;

            //System.out.println(t1);
            //System.out.println(t2);
            //System.out.println(c1);
            //System.out.println(c2);
            if(c1>c2)
            {
              if(t2==num1)
              re[k]=++c2;
              else
              re[k]=c2;
            }
            else if(c1<c2)
            {
              if(t1==num1)
              re[k]=++c1;
              else
              re[k]=c1;
            }
            else if(c1==c2)
            re[k]=c1;
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
  int checknum(int a)
  {
    int a1=a;
    temp=1;
    while(a!=1)
    {
      a=a/2;
      temp=temp*2;
    }
    if(temp==a1)
    return 0;
    else
    return -1;
  }
}
